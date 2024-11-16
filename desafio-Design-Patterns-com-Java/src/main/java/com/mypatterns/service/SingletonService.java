package com.mypatterns.service;

import com.mypatterns.model.SingletonExample;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    public String getSingletonMessage() {
        SingletonExample singleton = SingletonExample.getInstance();
        return singleton.getMessage();
    }
}
