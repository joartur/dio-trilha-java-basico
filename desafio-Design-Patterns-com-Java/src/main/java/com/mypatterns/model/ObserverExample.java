package com.mypatterns.model;

import com.mypatterns.util.Observer;
import com.mypatterns.util.ObserverListener;

public class ObserverExample implements ObserverListener {
    private Observer observer = new Observer();

    public ObserverExample() {
        observer.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Observer received: " + message);
    }

    public void changeState() {
        observer.notifyObservers("State has changed!");
    }
}
