package com.example.finalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
//import android.widget.EditText;
public class loga3 extends AppCompatActivity {
    private WebView webView;
    private String txtURL = "http://10.0.2.2:9999/clicker/select3?choice='a'";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loga3);
        webView = (WebView) findViewById(R.id.webView6);
        //webView.getSettings().setJavaScriptEnabled(true);responses?QuestionID=&attempt=A
        webView.loadUrl(txtURL);  // URL hardcoded
    }
    public void btn6Handler(View view) {
        Intent intent11 = new Intent(this, Stats.class);
        // Start the intended activity
        startActivity(intent11);
    }
}
