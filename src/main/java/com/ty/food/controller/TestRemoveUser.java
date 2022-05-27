package com.ty.food.controller;

import com.ty.food.service.UserService;

public class TestRemoveUser {
	public static void main(String[] args) {
		UserService service = new UserService();
		boolean res = service.deleteUserById(2);
		if (res) {
			System.out.println("User deleted");
		} else {
			System.out.println("User not available");
		}
	}
}
