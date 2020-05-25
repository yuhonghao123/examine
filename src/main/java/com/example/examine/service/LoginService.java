package com.example.examine.service;

import com.example.examine.pojo.UserPo;

public interface LoginService {
    UserPo login(String username, String password);
}
