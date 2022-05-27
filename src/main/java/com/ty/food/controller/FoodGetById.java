package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class FoodGetById {
public static void main(String[] args) {
	FoodOrderService foodOrderService=new FoodOrderService();
	FoodOrder foodOrder=foodOrderService.getOrderById(2);
	if(foodOrder!=null)
	{ 
	List<Item> list=foodOrder.getItems();
	System.out.println("------Order details-------");
	System.out.println("The user name :"+foodOrder.getName());
	System.out.println("The user phone :"+foodOrder.getPhone());
	double count=0;
	for(Item item:list)
	{
		System.out.println("Item name :"+item.getName());
		System.out.println("Item quantity :"+item.getQuantity());
		System.out.println("Item cost :"+item.getCost());
	}
	System.out.println("The total amount of bill is :"+foodOrder.getTotal());
	}
	else
	{
		System.out.println("No order available for this id");
	}
}
}
