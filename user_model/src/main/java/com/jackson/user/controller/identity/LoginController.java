package com.jackson.user.controller.identity;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController("identity")
public class LoginController {



    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Object login(HttpRequest request){


        return new Object();
    }
}
