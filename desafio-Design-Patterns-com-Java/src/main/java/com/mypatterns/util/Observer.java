package com.mypatterns.util;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<ObserverListener> listeners = new ArrayList<>();

    public void addObserver(ObserverListener listener) {
        listeners.add(listener);
    }

    public void notifyObservers(String message) {
        for (ObserverListener listener : listeners) {
            listener.update(message);
        }
    }
}
