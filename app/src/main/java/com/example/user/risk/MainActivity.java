package com.example.user.risk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSignUp,buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSignUp=findViewById(R.id.button_signup);
        buttonSignIn=findViewById(R.id.button_signin);

        buttonSignIn.setOnClickListener(this);
        buttonSignUp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_signin:
                Intent intent=new Intent(MainActivity.this,SignInActivity.class);
                startActivity(intent);
                break;
            case R.id.button_signup:
                Intent intent1=new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
