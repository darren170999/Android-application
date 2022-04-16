package com.example.finalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
//import android.widget.EditText;
public class logc extends AppCompatActivity {
    private WebView webView;
    private String txtURL = "http://10.0.2.2:9999/clicker/select3?choice='c'";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logc);
        webView = (WebView) findViewById(R.id.webView8);
        //webView.getSettings().setJavaScriptEnabled(true);responses?QuestionID=&attempt=A
        webView.loadUrl(txtURL);  // URL hardcoded
    }
    public void btn8Handler(View view) {
        Intent intent13 = new Intent(this, Stats.class);
        // Start the intended activity
        startActivity(intent13);
    }
}
