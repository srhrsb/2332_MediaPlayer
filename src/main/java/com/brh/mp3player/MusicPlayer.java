package com.brh.mp3player;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MusicPlayer {

    private static MusicPlayer instance;
    private boolean mute;
    private MediaPlayer mp;

    private MusicPlayer(){}

    public static synchronized MusicPlayer getInstance(){

        if(instance == null){
            instance = new MusicPlayer();
        }

        return instance;
    }

    public void play( String path ){
        Media media = new Media( new File(path).toURI().toString() );
        mp = new MediaPlayer( media );
        mp.stop();
        mp.play();
    }

    public void stop(){
        if(mp == null) return;
        mp.stop();
    }

    public void setVolume( double vol ){
        if(mp == null) return;
        mp.setVolume( vol );
    }

    public void toggleMute(){
        mute = !mute;
        mp.setMute(mute);
    }
}
