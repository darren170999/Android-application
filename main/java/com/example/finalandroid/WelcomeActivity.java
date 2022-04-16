package com.example.finalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activity);
    }
    public void btn1Handler(View view) {
        // Create an Intent to start the second activity called "WebViewActivity"
        Intent intent = new Intent(this, question1.class);
        // Start the intended activity
        startActivity(intent);
    }

}