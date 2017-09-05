package org.spring.springboot;

import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    CityDubboConsumerService cityDubboConsumerService;

    @GetMapping(value = "login")
    public void login (){
        cityDubboConsumerService.printCity();

    }

}
