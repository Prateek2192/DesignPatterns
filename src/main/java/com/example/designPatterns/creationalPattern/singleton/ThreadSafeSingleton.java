package com.example.designPatterns.creationalPattern.singleton;

// Though this is a thread safe but this degrades the performance significantly.
// Acquiring and releasing the lock with every call to getInstance() seems unnecessary.
public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton instance = null;


    public synchronized static ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
            return instance;
        }
        return instance;

    }
}
