package com.example.finalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
//import android.widget.EditText;
public class loga2 extends AppCompatActivity {
    private WebView webView;
    private String txtURL = "http://10.0.2.2:9999/clicker/select2?choice='a'";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loga2);
        webView = (WebView) findViewById(R.id.webView4);
        //webView.getSettings().setJavaScriptEnabled(true);responses?QuestionID=&attempt=A
        webView.loadUrl(txtURL);  // URL hardcoded
    }
    public void btn4Handler(View view) {
        Intent intent5 = new Intent(this, question3.class);
        // Start the intended activity
        startActivity(intent5);
    }
}