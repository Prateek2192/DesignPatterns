package com.example.designPatterns.behavioralPattern.observer;

public class Subscriber2 implements Observer {
    @Override
    public void updateMessage(Message message) {
        System.out.println("SUBSCRIBER-2:: notification received from publisher  => " + message.messageBody());
    }
}
