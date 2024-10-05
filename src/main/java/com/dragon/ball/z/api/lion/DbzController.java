package com.dragon.ball.z.api.lion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbzController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, I'm a new Controller";
    }

}
