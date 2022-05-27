package com.ty.food.service;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;

public class MenuService {

	public Menu saveMenu(Menu menu)
	{
		MenuDao dao=new MenuDao();
		return dao.saveMenu(menu);
	}
	
	public Menu getMenuById(int id)
	{
		MenuDao dao=new MenuDao();
		return dao.getMenuById(id);
	}
	
	public boolean deleteMenuById(int id)
	{
		MenuDao dao=new MenuDao();
		return dao.deleteMenuById(id);
	}
}
