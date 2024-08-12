package com.example.designPatterns.creationalPattern.singleton;

// Instance of a class is created before it is requested.
public class EagerSingleton {
    private EagerSingleton() {
    }

    private static volatile EagerSingleton instance = new EagerSingleton();

    public EagerSingleton getInstance() {
        return instance;
    }
}
