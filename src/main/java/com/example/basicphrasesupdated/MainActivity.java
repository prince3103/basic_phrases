package com.example.basicphrasesupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view){
        try{
        Button button_pressed = (Button) view;
        String btn_tag = button_pressed.getTag().toString();
        String song = "R.raw."+ btn_tag;

            MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(btn_tag, "raw", this.getPackageName()));
            mediaPlayer.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
