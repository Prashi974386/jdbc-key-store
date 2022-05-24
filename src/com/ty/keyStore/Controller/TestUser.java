package com.ty.keyStore.Controller;

import com.ty.keyStore.Service.UserService;
import com.ty.keyStore.dto.User;

public class TestUser
{
	public static void main(String[] args) 
	{
		User user = new User();
		user.setUid(1);
		user.setName("Prasi");
		user.setEmail("parshi@gmail.com");
		user.setPassword("prashi123");
		UserService userService = new UserService();
		int res = userService.saveUserService(user);
		if(res>0)
		{
			System.out.println("Addedd successfully");
		}
		else
			System.out.println("No data is Exist");
	}
}
