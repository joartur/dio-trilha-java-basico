package com.mypatterns.service;

import com.mypatterns.model.ConcreteStrategyA;
import com.mypatterns.util.StrategyContext;
import org.springframework.stereotype.Service;

@Service
public class StrategyService {
    public String executeStrategy() {
        StrategyContext context = new StrategyContext(new ConcreteStrategyA());
        return context.executeStrategy();
    }
}
