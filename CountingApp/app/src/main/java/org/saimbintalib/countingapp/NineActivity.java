package org.saimbintalib.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NineActivity extends AppCompatActivity {

    int move = 0;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
    }
    public void Next(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Previous(View view)
    {
        Intent intent = new Intent(this, EightActivity.class);
        startActivity(intent);
    }

    public void PlayAudio(View view) {
        ImageView img = findViewById(R.id.imageView);
        if(move==0)
        {
            img.animate().translationYBy(-100).setDuration(1000);
            move = 1;
        }
        else
        {
            img.animate().translationYBy(100).setDuration(1000);
            move = 0;
        }
        mp = MediaPlayer.create(this,R.raw.nine);
        mp.start();
    }
}