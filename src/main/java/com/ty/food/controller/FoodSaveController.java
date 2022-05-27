package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class FoodSaveController {
public static void main(String[] args) {
	Item item1=new Item();
	item1.setName("Kushka");
	item1.setQuantity(1);
	item1.setCost(75);
	Item item2=new Item();
	item2.setName("Kabab");
	item2.setQuantity(6);
	item2.setCost(100);
	
	List<Item> list=new ArrayList<Item>();
	list.add(item2);
	list.add(item1);
	
	FoodOrder foodOrder=new FoodOrder();
	foodOrder.setName("Tejas");
	foodOrder.setPhone("9986875119");
	foodOrder.setItems(list);
	double total=0;
	for (Item item : foodOrder.getItems()) {
		total=total+(item.getCost()*item.getQuantity());
	}
	foodOrder.setTotal(total);
	item1.setFoodOrder(foodOrder);
	item2.setFoodOrder(foodOrder);
		
	FoodOrderService service=new FoodOrderService();
	service.saveOrder(foodOrder);
	System.out.println("------Order details-------");
	System.out.println("The user name :"+foodOrder.getName());
	System.out.println("The user phone :"+foodOrder.getPhone());
	for(Item item:list)
	{
		System.out.println("Item name :"+item.getName());
		System.out.println("Item quantity :"+item.getQuantity());
		System.out.println("Item cost :"+item.getCost());
	}
	System.out.println("The total cost is :"+total);
	
}
}
