package com.example.projext.com.potter.login.controller;

import com.example.projext.com.potter.login.service.IUserService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private IUserService userService;


    // http://127.0.0.1:8080/login/create_user
    @GetMapping("/create_user")
    @ResponseBody
    public String create() throws IOException {
        ClassPathResource resource = new ClassPathResource("static/sign_up.html");
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }

    @RequestMapping("/sign_in")
    @ResponseBody
    public String signIn() throws IOException{
        ClassPathResource resource = new ClassPathResource("static/login.html");
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }


    @RequestMapping("/logins/{phone}")
    @ResponseBody
    public String login(@PathVariable String phone) {
        userService.add(phone);
        return "这是个登陆页面";
    }

}
