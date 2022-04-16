package com.example.finalandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question2 extends AppCompatActivity implements View.OnClickListener {
    private TextView txtTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.taxi);
//        mp.stop();
        mp.start();
        mp.setLooping(true);
        final MediaPlayer click = MediaPlayer.create(this, R.raw.click);
        Button bnA2 = findViewById(R.id.btnA2);
        Button bnB2 = findViewById(R.id.btnB2);
        bnA2.setOnClickListener(this);
        bnB2.setOnClickListener(this);
        txtTimer = (TextView) findViewById(R.id.txtTimer2);
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
            case R.id.btnA2:
                click.start();
                Intent intent4 = new Intent(this, loga2.class);
                // Start the intended activity
                startActivity(intent4);
            case R.id.btnB2:
                click.start();
                Intent intents4 = new Intent(this, logb2.class);
                // Start the intended activity
                startActivity(intents4);
        }

    }
}