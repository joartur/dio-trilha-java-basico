package com.mypatterns.model;

public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {
        // Construtor privado para impedir instanciação direta
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public String getMessage() {
        return "Singleton Example!";
    }
}
