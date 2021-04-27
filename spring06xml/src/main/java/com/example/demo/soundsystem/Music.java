package com.example.demo.soundsystem;

public class Music {
    private String title;
    private Integer duration;

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Music() {
        super();
    }

    public Music(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }
}