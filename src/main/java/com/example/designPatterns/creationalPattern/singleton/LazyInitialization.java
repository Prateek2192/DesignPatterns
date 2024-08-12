package com.example.designPatterns.creationalPattern.singleton;

// Lazy initialisation with synchronised.
public class LazyInitialization {
    private static volatile LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {

        if (instance == null) {
            synchronized (LazyInitialization.class) {
                instance = new LazyInitialization();
            }
        }
        return instance;
    }
}
