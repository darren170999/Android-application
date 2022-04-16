package com.example.finalandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class question1 extends AppCompatActivity implements View.OnClickListener {
    private TextView txtTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.taxi);
        mp.start();
        mp.setLooping(true);
        //click sound
        final MediaPlayer click = MediaPlayer.create(this, R.raw.click);
        Button bnA = findViewById(R.id.btnA);
        Button bnB = findViewById(R.id.btnB);
        bnA.setOnClickListener(this);
        bnB.setOnClickListener(this);
        txtTimer = (TextView) findViewById(R.id.txtTimer);
//        Count down from 30 sec. onTick() every second. Values in milliseconds
        new CountDownTimer(30000, 1000) {
            public void onTick(long millisRemaining) {
                txtTimer.setText("Seconds remaining: " + millisRemaining / 1000);
            }
            public void onFinish() {
                txtTimer.setText("Time's Up!");
            }
        }.start();
    }

    @Override
    public void onClick(View view) {
        final MediaPlayer click = MediaPlayer.create(this, R.raw.click);
        switch(view.getId()){
            case R.id.btnA:
                click.start();
                Intent intent1 = new Intent(this, loga.class);
                // Start the intended activity
                startActivity(intent1);
            case R.id.btnB:
                click.start();
                Intent intents1 = new Intent(this, logb.class);
                // Start the intended activity
                startActivity(intents1);
        }

    }

}