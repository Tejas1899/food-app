package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Menu;
import com.ty.food.dto.User;

public class MenuDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Menu saveMenu(Menu menu)
	{
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return entityManager.find(Menu.class,menu.getId());
	}
	
	public Menu getMenuById(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		if (menu != null) {
			return menu;
		} else {
			return null;
		}

	}
	
	public boolean deleteMenuById(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		boolean res = true;
		if (menu != null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
			return res;
		} else {
			res = false;
			return res;
		}

	}
}
