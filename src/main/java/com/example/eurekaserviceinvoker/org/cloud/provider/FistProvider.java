package com.example.eurekaserviceinvoker.org.cloud.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FistProvider {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        System.out.println("["+request.getRequestURL()+"]服务被调用！");
        return  "Hello World   1!";
    }

    @RequestMapping("/sayBye")
    public String sayBey(){
        return  "Bye !";
    }
}
