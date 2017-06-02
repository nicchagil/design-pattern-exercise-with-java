package com.nicchagil.concrete;

import com.nicchagil.template.AbstractDAO;
import com.nicchagil.template.AbstractSimpleServiceTemplate;

public class UserService extends AbstractSimpleServiceTemplate<User> {

	@Override
	protected AbstractDAO<User> getDAO() {
		return new UserDAO();
	}
	
}
