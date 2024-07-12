package com.brh.mp3player;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {

    private final MusicPlayer musicPlayer = new MusicPlayer();

    @FXML
    private Label fileLabel;

    @FXML
    private Slider volumeSlider;


    @FXML
    protected void onFile(){

        Stage stage = (Stage) fileLabel.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        fileLabel.setText(file.getAbsolutePath());
    }

    @FXML
    protected void onPlay(){
         String file = fileLabel.getText();
         musicPlayer.play(file);
    }

    @FXML
    protected void onStop(){
        musicPlayer.stop();
    }

    @FXML
    protected void onVolume(){
        musicPlayer.setVolume( volumeSlider.getValue() );
    }

    @FXML
    protected void onMute(){
        musicPlayer.mute();
    }
}