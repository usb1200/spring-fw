package com.fw.springfw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author admin
 * @ClassName UserController
 * @Date 2023.04.28
 */

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/")
    public String login() {
        return "hello word!";
    }


    @RequestMapping("/getUser")
    public String getUser() {
        return "hello word!";
    }
}
