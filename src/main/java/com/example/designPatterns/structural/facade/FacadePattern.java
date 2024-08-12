package com.example.designPatterns.structural.facade;

public class FacadePattern {
    public static void main(String[] args) {
        MultiMediaFacade multiMediaFacade = new MultiMediaFacade();
        multiMediaFacade.playMultimedia("xyzAudio", "Audio");
        multiMediaFacade.playMultimedia("xyzVideo", "Video");
    }
}
