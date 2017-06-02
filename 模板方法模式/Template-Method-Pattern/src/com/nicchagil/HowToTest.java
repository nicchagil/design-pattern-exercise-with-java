package com.nicchagil;

import com.nicchagil.concrete.User;
import com.nicchagil.concrete.UserService;

public class HowToTest {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User userA = new User();
		userA.setName("Nick Huang");
		userService.insertOrUpdate(userA);
		
		User userB = new User();
		userB.setId(1);
		userB.setName("Nick Huang");
		userService.insertOrUpdate(userB);
	}

}
