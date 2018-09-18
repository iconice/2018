package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

	@Override
	public User loginByUandP(String username, String password) {
		// TODO Auto-generated method stub
		User use = new User();
		use.setUserName(username);
		use.setPassword(password);
		User use1 = this.userDao.loginByUandP(use);
		return use1;
	}

}