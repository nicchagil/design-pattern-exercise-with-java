package com.nicchagil.concrete;

import java.util.logging.Logger;

import com.nicchagil.template.AbstractDAO;

public class UserDAO extends AbstractDAO<User> {
	
	Logger logger = Logger.getLogger("UserDAO");

	@Override
	public int insert(User t) {
		this.logger.info("insert " + t);
		return 1;
	}

	@Override
	public int updateByPrimarySelective(User t) {
		this.logger.info("updateByPrimarySelective " + t);
		return 1;
	}

	@Override
	public User selectByPrimary(Long id) {
		this.logger.info("selectByPrimary ");
		return null;
	}
	
}
