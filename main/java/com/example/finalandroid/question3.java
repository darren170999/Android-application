package com.example.finalandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question3 extends AppCompatActivity implements View.OnClickListener {
    private TextView txtTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.taxi);
        mp.start();
        mp.setLooping(true);
        final MediaPlayer click = MediaPlayer.create(this, R.raw.click);
        Button bnA2 = findViewById(R.id.btnA3);
        Button bnB2 = findViewById(R.id.btnB3);
        Button bnC = findViewById(R.id.btnC);
        Button bnD = findViewById(R.id.btnD);
        bnA2.setOnClickListener(this);
        bnB2.setOnClickListener(this);
        bnC.setOnClickListener(this);
        bnD.setOnClickListener(this);
        txtTimer = (TextView) findViewById(R.id.txtTimer3);
//         Count down from 30 sec. onTick() every second. Values in milliseconds
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
            case R.id.btnA3:
                click.start();
                Intent intent7 = new Intent(this, loga3.class);
                // Start the intended activity
                startActivity(intent7);
            case R.id.btnB3:
                click.start();
                Intent intent8 = new Intent(this, logb3.class);
                // Start the intended activity
                startActivity(intent8);
            case R.id.btnC:
                click.start();
                Intent intent9 = new Intent(this, logc.class);
                // Start the intended activity
                startActivity(intent9);
            case R.id.btnD:
                click.start();
                Intent intent10 = new Intent(this, logd.class);
                // Start the intended activity
                startActivity(intent10);
        }
    }
}