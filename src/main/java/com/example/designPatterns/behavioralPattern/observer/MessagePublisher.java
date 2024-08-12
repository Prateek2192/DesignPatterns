package com.example.designPatterns.behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public boolean subscribe(Observer o) {
        return observers.add(o);
    }

    @Override
    public boolean unsubscribe(Observer o) {
        return observers.remove(o);
    }

    @Override
    public void updateMessage(Message m) {
        observers.forEach(o -> o.updateMessage(m));
    }
}
