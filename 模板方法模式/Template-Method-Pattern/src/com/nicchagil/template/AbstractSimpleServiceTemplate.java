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
		
		Method getIdMethod = ReflectUtils.getMethod(t.getClass(), "getId", null);
		Object result = ReflectUtils.invoke(getIdMethod, t, null);
		
		if (result == null) { // 插入
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
