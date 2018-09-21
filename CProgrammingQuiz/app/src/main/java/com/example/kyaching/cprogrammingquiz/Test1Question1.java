package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test1Question1 extends AppCompatActivity {
    private Button buttonA, buttonB, buttonC, buttonD, nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1_question1);


        buttonA = (Button) (findViewById(R.id.buttonoptionA));
        buttonB = (Button) (findViewById(R.id.buttonoptionB));
        buttonC = (Button) (findViewById(R.id.buttonoptionC));
        buttonD = (Button) (findViewById(R.id.buttonoptionD));
        nextbutton = (Button) (findViewById(R.id.nextbuttonid));
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1Question1.this, Test1Question10.class);
                startActivity(intent);
            }
        });
    }
}

