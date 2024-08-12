package com.example.designPatterns.behavioralPattern.observer;

public class Subscriber1 implements Observer {
    @Override
    public void updateMessage(Message message) {
        System.out.println("SUBSCRIBER-1:: notification received from publisher  => " + message.messageBody());
    }
}
