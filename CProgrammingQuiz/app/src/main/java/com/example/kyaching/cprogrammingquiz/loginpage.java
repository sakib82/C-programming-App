package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {

    private Button login_button,sign_up_now_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage2);

        //getSupportActionBar().setTitle("Log in");

        login_button = (Button) findViewById(R.id.Log_in_button);
        sign_up_now_button = (Button) findViewById(R.id.sign_up_now_button);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginpage.this,QuizMainActivity.class);
                startActivity(intent);
            }
        }
        );

        sign_up_now_button.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View v) {
             Intent intent = new Intent(loginpage.this,SignInActivity.class);
             startActivity(intent);
             }
          }
        );
    }
}
