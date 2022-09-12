package com.gokul.kubecloud.controller;


import com.gokul.kubecloud.controller.dto.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public HelloWorldResponse getResponse(){
        return HelloWorldResponse.builder().message("Hello World").build();
    }

}
