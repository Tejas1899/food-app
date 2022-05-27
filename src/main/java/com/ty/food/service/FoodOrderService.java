package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

public class FoodOrderService {

	public FoodOrder saveOrder(FoodOrder foodOrder)
	{
		FoodOrderDao dao=new FoodOrderDao();
		return dao.saveOrder(foodOrder);
	}
	
	public FoodOrder getOrderById(int id)
	{
		FoodOrderDao dao=new FoodOrderDao();
		return dao.getOrderById(id);
	}
	
	public boolean removeOrder(int id)
	{
		FoodOrderDao dao=new FoodOrderDao();
		return dao.removeOrder(id);
	}
	
	public List<FoodOrder> getOrderByNumber(String number)
	{
		FoodOrderDao dao=new FoodOrderDao();
		return dao.getOrderByNumber(number);
	}
	
	public List<FoodOrder> getOrderByName(String name)
	{
		FoodOrderDao dao=new FoodOrderDao();
		return dao.getOrderByName(name);
	}
	
}
