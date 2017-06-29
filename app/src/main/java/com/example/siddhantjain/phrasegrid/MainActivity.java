package com.example.siddhantjain.phrasegrid;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this); // calling onClick() method
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        Button b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
            switch (v.getId()) {

                case R.id.b1:
                    mplayer = MediaPlayer.create(this,R.raw.hello);
                    mplayer.start();
                    break;

                case R.id.b2:
                    mplayer = MediaPlayer.create(this,R.raw.goodevening);
                    mplayer.start();
                    break;

                case R.id.b3:
                    mplayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
                    mplayer.start();
                    break;
                case R.id.b4:
                    mplayer = MediaPlayer.create(this,R.raw.howareyou);
                    mplayer.start();
                    break;

                case R.id.b5:
                    mplayer = MediaPlayer.create(this,R.raw.ilivein);
                    mplayer.start();
                    break;

                case R.id.b6:
                    mplayer = MediaPlayer.create(this,R.raw.mynameis);
                    mplayer.start();
                    break;
                case R.id.b7:
                    mplayer = MediaPlayer.create(this,R.raw.please);
                    mplayer.start();
                    break;

                case R.id.b8:
                    mplayer = MediaPlayer.create(this,R.raw.welcome);
                    mplayer.start();
                    break;

                default:
                    break;
            }
    }

}
