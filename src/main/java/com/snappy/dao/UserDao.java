package com.snappy.dao;

import org.springframework.stereotype.Component;
 
import com.snappy.po.User;
 
@Component(value="userDao")
public interface UserDao {
 
      public int addUser(User user); 
}