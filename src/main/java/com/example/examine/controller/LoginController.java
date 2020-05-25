package com.example.examine.controller;

import com.example.examine.pojo.UserPo;
import com.example.examine.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public UserPo login(@RequestBody Map<String, String> login) throws Exception {
        UserPo userPojo=loginService.login(login.get("username"), login.get("password"));
        if (userPojo==null){
            throw new Exception("There is no such user");
        }else {
            return userPojo;
        }
    }
}