package com.example.finalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
//import android.widget.EditText;
public class loga extends AppCompatActivity {
    private WebView webView;
    private String txtURL = "http://10.0.2.2:9999/clicker/select?choice='a'";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loga);
        webView = (WebView) findViewById(R.id.webView2);
        //webView.getSettings().setJavaScriptEnabled(true);responses?QuestionID=&attempt=A
        webView.loadUrl(txtURL);  // URL hardcoded
    }
    public void btn2Handler(View view) {
        Intent intent2 = new Intent(this, question2.class);
        // Start the intended activity
        startActivity(intent2);
    }
}