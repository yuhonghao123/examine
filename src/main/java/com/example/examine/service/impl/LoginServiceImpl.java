package com.example.examine.service.impl;

import com.example.examine.dao.UserDao;
import com.example.examine.pojo.UserPo;
import com.example.examine.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserPo login(String username, String password) {
        UserPo userPojo=userDao.getByUserNameAndPassword(username, password);
        return userPojo;
    }
}
