package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test1Question1 extends AppCompatActivity {
    private Button buttonA, buttonB, buttonC, buttonD, nextbutton;
    private TextView questiontextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1_question1);

        questiontextview = (TextView) findViewById(R.id.questiontextviewid) ;
        questiontextview.setText(getResources().getString(R.string.test1question1));

        buttonA = (Button) (findViewById(R.id.buttonoptionA));
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA.setBackgroundColor(getResources().getColor(R.color.blue));
                nextbutton.setVisibility(View.VISIBLE);
            }
        });

        buttonB = (Button) (findViewById(R.id.buttonoptionB));
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA.setBackgroundColor(getResources().getColor(R.color.blue));
                nextbutton.setVisibility(View.VISIBLE);
            }
        });

        buttonC = (Button) (findViewById(R.id.buttonoptionC));
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA.setBackgroundColor(getResources().getColor(R.color.blue));
                nextbutton.setVisibility(View.VISIBLE);
            }
        });

        buttonD = (Button) (findViewById(R.id.buttonoptionD));
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonA.setBackgroundColor(getResources().getColor(R.color.blue));
                nextbutton.setVisibility(View.VISIBLE);
            }
        });
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

