package com.example.notesd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonSignIn;
    private EditText emailId;
    private EditText password;
    private TextView textSignUp;

    @Override
    public void onClick(View v) {
        if(View == buttonSignIn)
        {

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailId = (EditText) findViewById(R.id.email_id);
        password = (EditText) findViewById(R.id.password);
        buttonSignIn = (Button) findViewById(R.id.sign_in_1);
        textSignUp = (TextView) findViewById(R.id.sign_up_1);

        textSignUp.setOnClickListener();
    }
}
