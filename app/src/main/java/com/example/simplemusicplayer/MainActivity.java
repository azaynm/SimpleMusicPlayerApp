package com.example.simplemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Creating an instance of a MediaPlayer class
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigns the music to the object
        song = MediaPlayer.create(this, R.raw.royaltyfreesong);
    }

    //Method to play the song
    public void playSong(View view){
        song.start();
    }

    //method to pause the song
    public void pauseSong(View view){
        song.pause();
    }

    //Method to stop the song
    public void stopSong(View view){
        song.stop();
        //stop() will delete the created music so that we need to assign the music to the object again
        song = MediaPlayer.create(this, R.raw.royaltyfreesong);
    }
}