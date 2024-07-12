package com.brh.mp3player;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MusicPlayer {

    private boolean mute;
    private MediaPlayer mp;

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

    public void mute(){
        mute = !mute;
        mp.setMute(mute);
    }
}
