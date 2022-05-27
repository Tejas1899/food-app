package com.ty.food.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder saveOrder(FoodOrder foodOrder) {
		// List<Item> list=new ArrayList<Item>();
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		return entityManager.find(FoodOrder.class, foodOrder.getId());
	}

	public FoodOrder getOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);

		if (foodOrder != null) {
			return foodOrder;
		} else {
			return null;
		}
	}

	public List<FoodOrder> getOrderByNumber(String number) {
		Query query = entityManager.createQuery("Select f from FoodOrder f where f.phone=?1");
		query.setParameter(1, number);
		List<FoodOrder> list = query.getResultList();
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	public List<FoodOrder> getOrderByName(String name) {
		Query query = entityManager.createQuery("Select f from FoodOrder f where f.name=?1");
		query.setParameter(1, name);
		List<FoodOrder> list = query.getResultList();
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

	public boolean removeOrder(int id) {
		boolean flag = true;
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		if (foodOrder != null) {
			for (Item item : foodOrder.getItems()) {
				entityManager.remove(item);
			}
			entityManager.remove(foodOrder);
			entityTransaction.commit();
			return flag;
		} else {
			flag = false;
			return flag;
		}
	}

	
}
