package com.example.designPatterns.creationalPattern.singleton;

import java.io.Serializable;

public class SerializationSafeSingleton implements Serializable {
    private static SerializationSafeSingleton instance = new SerializationSafeSingleton();

    private SerializationSafeSingleton() {
    }

    public static SerializationSafeSingleton getInstance() {
        return instance;
    }

    // used during deserialization process.
    protected Object readResolve() {
        return instance;
    }


}
