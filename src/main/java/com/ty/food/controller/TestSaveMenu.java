package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestSaveMenu {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setName("Biryani");
		menu.setDescription("With chicken");
		menu.setCost(100);
		menu.setOffer("Buy 1 get 1");
		menu.setType("Non-Veg");
		menu.setImage("https://upload.wikimedia.org/wikipedia/commons/c/cf/Biryani_of_Lahore.jpg");
		MenuService menuService = new MenuService();
		menuService.saveMenu(menu);

	}
}
