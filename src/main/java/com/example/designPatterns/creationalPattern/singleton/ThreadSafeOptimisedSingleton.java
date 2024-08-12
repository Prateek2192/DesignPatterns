package com.example.designPatterns.creationalPattern.singleton;

// Double check Singleton with optimised synchronisation.
public class ThreadSafeOptimisedSingleton {
    private static volatile ThreadSafeOptimisedSingleton instance;

    private ThreadSafeOptimisedSingleton() {
    }

    public static ThreadSafeOptimisedSingleton getInstance() {

        if (instance == null) {
            synchronized (ThreadSafeOptimisedSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeOptimisedSingleton();
                }
            }
        }
        return instance;
    }
}
