package com.ty.food.controller;

import com.ty.food.service.FoodOrderService;

public class FoodRemoveOrder {
public static void main(String[] args) {
	FoodOrderService service=new FoodOrderService();
	boolean res=service.removeOrder(10);
	System.out.println("-----------------------------");
	if(res)
	{
		System.out.println("Order deleted");
	}
	else
	{
		System.out.println("Order id doesnot exist");
	}
}
}
