package com.example.examine.controller;

import com.example.examine.pojo.Result;
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
    public Result login(@RequestBody Map<String, String> login) {
        UserPo userPo=loginService.login(login.get("username"), login.get("password"));
        if (userPo==null){
            return Result.fail();
        }else {
            return Result.success(userPo);
        }
    }
}