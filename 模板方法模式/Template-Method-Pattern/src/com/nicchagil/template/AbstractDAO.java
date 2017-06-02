package com.nicchagil.template;

public abstract class AbstractDAO<T> {
	
	public abstract int insert(T t);
	
	public abstract int updateByPrimarySelective(T t);
	
	public abstract T selectByPrimary(Long id);

}
