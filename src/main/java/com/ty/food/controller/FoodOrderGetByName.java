package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class FoodOrderGetByName {
	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		List<FoodOrder> list = foodOrderService.getOrderByName("rahul");
		if (list.size()>0) {

			for (FoodOrder food : list) {
				System.out.println("The number is :" + food.getPhone());
				// System.out.println("The item name is :"+food.get);

				for (Item item : food.getItems()) {
					System.out.println("The item name is :" + item.getName());
					System.out.println("The item cost is :" + item.getCost());
					System.out.println("The item quantity is :" + item.getQuantity());
				}
			}
		} else {
			System.out.println("No foodOrder available for this name");
		}
	}
}
