package com.nicchagil.template;
import java.lang.reflect.Method;

public abstract class AbstractSimpleServiceTemplate<T> {
	
	/**
	 * 获取DAO对象（抽象方法，待实现）
	 * @return DAO对象
	 */
	protected abstract AbstractDAO<T> getDAO();
	
	/**
	 * 插入或更新（模板方法，一般用于总体逻辑的调兵遣将（调用抽象方法、钩子方法））
	 */
	public final int insertOrUpdate(T t) {
		if (t == null) {
			return 0;
		}
		
		/* 获取getId方法（约定getId方法为获取ID值的方法） */
		Method getIdMethod = ReflectUtils.getMethod(t.getClass(), "getId", null);
		Object idObj = ReflectUtils.invoke(getIdMethod, t, null);
		if (idObj == null) {
			return 0;
		}
		
		/* 调用Mapper的selectByPrimary方法（按照Mybatis生成代码的约定，此方法为根据主键查询记录） */
		Method selectByPrimaryMethod = ReflectUtils.getMethod(t.getClass(), "selectByPrimary", null);
		Object selectByPrimaryResult = ReflectUtils.invoke(getIdMethod, this.getDAO(), idObj);
		
		/* 以是否有此ID的记录判断作插入操作还是更新操作 */
		if (selectByPrimaryResult == null) { // 插入
			return this.insert(t);
		} else { // 更新
			return this.updateByPrimarySelective(t);
		}
	}
	
	public int insert(T t) {
		return this.getDAO().insert(t);
	}
	
	public int updateByPrimarySelective(T t) {
		return this.getDAO().updateByPrimarySelective(t);
	}
	
	public T selectByPrimary(Long id) {
		return this.getDAO().selectByPrimary(id);
	}
	
}
