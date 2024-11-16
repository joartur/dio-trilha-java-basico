package com.mypatterns.controller;

import com.mypatterns.service.FactoryService;
import com.mypatterns.service.SingletonService;
import com.mypatterns.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatternController {

    @Autowired
    private SingletonService singletonService;

    @Autowired
    private FactoryService factoryService;

    @Autowired
    private StrategyService strategyService;

    @GetMapping("/singleton")
    public String getSingletonMessage() {
        return singletonService.getSingletonMessage();
    }

    @GetMapping("/factory")
    public String getProduct() {
        return factoryService.getProduct("A");
    }

    @GetMapping("/strategy")
    public String executeStrategy() {
        return strategyService.executeStrategy();
    }
}
