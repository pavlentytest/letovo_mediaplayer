package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlay(View v) {
        switch (v.getId()) {
            case R.id.start:
                if(mp == null) {
                    mp = MediaPlayer.create(this, R.raw.canon);
                    mp.start();
                } else {
                    // pause
                    if(mp.isPlaying()) {
                        mp.pause();
                    } else {
                        mp.start(); // после паузы - продолжает
                    }
                }
                break;
            case R.id.stop:
                mp.stop();
                mp = null;
                break;
        }

    }
}