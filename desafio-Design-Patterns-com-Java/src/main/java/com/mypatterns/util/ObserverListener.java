package com.mypatterns.util;

public class ObserverListener implements Observer {
    private String name;

    public ObserverListener(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Listener " + name + " received message: " + message);
    }
}
