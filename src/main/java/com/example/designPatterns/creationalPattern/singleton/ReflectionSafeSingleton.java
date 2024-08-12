package com.example.designPatterns.creationalPattern.singleton;

public class ReflectionSafeSingleton {

    private ReflectionSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Illegal creation of instance");
        }
    }

    private static final ReflectionSafeSingleton instance = new ReflectionSafeSingleton();

    public static ReflectionSafeSingleton getInstance() {
        return instance;
    }
}
