package com.lx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class AppController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "hello";
    }
}
