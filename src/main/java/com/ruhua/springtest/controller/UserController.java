package com.ruhua.springtest.controller;


import com.ruhua.springtest.param.UserParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/model")
@ResponseBody
public class UserController {

    //登录
    @PostMapping("/users")
public String login(@RequestBody UserParam user) {


        return "login";
    }

}
