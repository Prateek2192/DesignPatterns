package com.example.designPatterns.creationalPattern.singleton;

public class CloneSafeSingleton implements Cloneable {
    private CloneSafeSingleton() {
    }

    private static final CloneSafeSingleton instance = new CloneSafeSingleton();

    public static CloneSafeSingleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance; // either throws Exception from here.
    }

}
