package com.snappy.services.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snappy.dao.UserDao;
import com.snappy.po.User;
import com.snappy.services.UserService;
 

 
@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService {
 
    @Resource(name="userDao")
    private UserDao userDao;
     
    public int register(User user) {
        // TODO Auto-generated method stub 
        return userDao.addUser(user);
    }
 
}