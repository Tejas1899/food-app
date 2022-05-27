package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestSaveUser {
public static void main(String[] args) {
	User user=new User();
	user.setName("kumara");
	user.setEmail("kumara@mail.com");
	user.setPassword("kumara@999");
	
	UserService service=new UserService();
	service.saveUser(user);

}
}
