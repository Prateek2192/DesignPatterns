package com.example.designPatterns.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();
        System.out.println(socketAdapter.get3Volt());
        System.out.println(socketAdapter.get12Volt());
        System.out.println(socketAdapter.get120Volt());
    }
}
