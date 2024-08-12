package com.example.designPatterns.behavioralPattern.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.updateMessage(new Message("first message"));

        // unsubscribed subscriber2
        publisher.unsubscribe(subscriber2);
        publisher.updateMessage(new Message("second message"));
    }
}
