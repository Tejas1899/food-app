package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class FoodGetByNumber {
public static void main(String[] args) {
	FoodOrderService foodOrderService=new FoodOrderService();
	List<FoodOrder> items= foodOrderService.getOrderByNumber("8861799230");
	if(items!=null) {
		for(FoodOrder foodOrder:items)
		{
			System.out.println("The name is :"+foodOrder.getName());

			for (Item item : foodOrder.getItems()) {
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
