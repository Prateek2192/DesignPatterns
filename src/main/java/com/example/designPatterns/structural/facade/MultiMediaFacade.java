package com.example.designPatterns.structural.facade;

public class MultiMediaFacade {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private VideoPlayer videoPlayer = new VideoPlayer();

    public void playMultimedia(String filePath, String mediaType) {

        if (mediaType.equals("Audio")) {
            audioPlayer.playAudio();
        } else if (mediaType.equals("Video")) {
            videoPlayer.playVideo();
        } else {
            System.out.println("Invalid media type");
        }

    }
}
