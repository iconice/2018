package com.ssm.service;

import com.ssm.pojo.User;

public interface IUserService {

	public User getUserById(int userId);
	
	public User loginByUandP(String username,String password);
}