package com.example.designPatterns.behavioralPattern.observer;

public interface Subject {

    public boolean subscribe(Observer o);
    public boolean unsubscribe(Observer o);
    public void updateMessage(Message m);
}
