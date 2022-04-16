package com.example.finalandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity{
    EditText nameBox, passwordBox;
    Button loginButton;
    TextView registerLink;
    String URL = "http://10.27.247.25:9999/clicker/login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameBox = (EditText)findViewById(R.id.nameBox);
        passwordBox = (EditText)findViewById(R.id.passwordBox);
        loginButton = (Button)findViewById(R.id.loginButton);
        registerLink = (TextView)findViewById(R.id.registerLink);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>(){
                    @Override
                    public void onResponse(String s) {
                        if(s.equals("true")){
                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(Login.this,WelcomeActivity.class));
                        }
                        else{
                            Toast.makeText(Login.this, "Incorrect Details", Toast.LENGTH_LONG).show();
                        }
                    }
                },new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Toast.makeText(Login.this, "Some error occurred -> "+volleyError, Toast.LENGTH_LONG).show();
                    }
                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("username", nameBox.getText().toString());
                        parameters.put("password", passwordBox.getText().toString());
                        return parameters;
                    }
                };

                RequestQueue rQueue = Volley.newRequestQueue(Login.this);
                rQueue.add(request);
            }
        });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }
}