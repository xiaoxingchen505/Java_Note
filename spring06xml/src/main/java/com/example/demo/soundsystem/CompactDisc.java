package com.example.demo.soundsystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompactDisc {

    private String title;
    private String artist;
//    private List<Music> tracks;
    private Music[] tracks;

    public CompactDisc() {
        super();
        System.out.println("CompactDisc构造函数..." + this.toString());
    }

    public CompactDisc(String title, String artist,Music[] tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        System.out.println("CompactDisc有三个参数的构造函数..." + this.toString());
    }

    public void play(){
        System.out.println("播放CD音乐....."+ this.toString()+""+this.title+" by " +this.artist);
        for (Music track : this.tracks) {
            System.out.println("音乐:" + track.getTitle()+".时长: " + track.getDuration());
        }
//        for (String key : this.tracks.keySet()){
//            System.out.println("key:" + key);
//            Music music = this.tracks.get(key);
//            System.out.println("音乐: "+ music.getTitle()+" 时长: "+ music.getDuration());
//        }


    }
}
