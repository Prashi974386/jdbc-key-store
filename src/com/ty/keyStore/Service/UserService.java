package com.ty.keyStore.Service;

import com.ty.keyStore.dao.UserDao;
import com.ty.keyStore.dto.User;

public class UserService
{
	UserDao dao = new UserDao();
	
	public int saveUserService(User user)
	{
		return dao.saveUser(user);
	}
}
