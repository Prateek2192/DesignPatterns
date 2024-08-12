package com.example.designPatterns.creationalPattern.singleton;


enum Singleton {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


public class EnumSingleton{
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}