package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test1Question1 extends AppCompatActivity {
    private Button buttonA, buttonB, buttonC, buttonD, nextbutton,checkbutton;
    private TextView questiontextview;

    int clicked = 0;
    int right_ans = 1;

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
                checkbutton.setVisibility(View.VISIBLE);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                clicked = 1;
            }
        });

        buttonB = (Button) (findViewById(R.id.buttonoptionB));
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonB.setBackgroundColor(getResources().getColor(R.color.blue));
                checkbutton.setVisibility(View.VISIBLE);
                buttonA.setEnabled(false);
                buttonC.setEnabled(false);
                buttonD.setEnabled(false);
                clicked = 2;
            }
        });

        buttonC = (Button) (findViewById(R.id.buttonoptionC));
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonC.setBackgroundColor(getResources().getColor(R.color.blue));
                checkbutton.setVisibility(View.VISIBLE);
                buttonB.setEnabled(false);
                buttonA.setEnabled(false);
                buttonD.setEnabled(false);
                clicked = 3;
            }
        });

        buttonD = (Button) (findViewById(R.id.buttonoptionD));
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonD.setBackgroundColor(getResources().getColor(R.color.blue));
                checkbutton.setVisibility(View.VISIBLE);
                buttonB.setEnabled(false);
                buttonC.setEnabled(false);
                buttonA.setEnabled(false);
                clicked = 4;
            }
        });

        checkbutton = (Button) (findViewById(R.id.checkbuttonid));
        nextbutton = (Button) (findViewById(R.id.nextbuttonid));
        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(clicked == 1 && right_ans == 1) {
                    buttonA.setBackgroundColor(getResources().getColor(R.color.green));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                if(clicked == 1 && right_ans != 1) {
                    buttonA.setBackgroundColor(getResources().getColor(R.color.red));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                if(clicked == 2 && right_ans == 2) {
                    buttonB.setBackgroundColor(getResources().getColor(R.color.green));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                if(clicked == 2 && right_ans != 2) {
                    buttonB.setBackgroundColor(getResources().getColor(R.color.red));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                 if(clicked == 3 && right_ans == 3) {
                     buttonC.setBackgroundColor(getResources().getColor(R.color.green));
                     nextbutton.setVisibility(View.VISIBLE);
                     checkbutton.setVisibility(View.INVISIBLE);
                 }

                 if(clicked == 3 && right_ans != 3) {
                     buttonC.setBackgroundColor(getResources().getColor(R.color.red));
                     nextbutton.setVisibility(View.VISIBLE);
                     checkbutton.setVisibility(View.INVISIBLE);
                 }

                if(clicked == 4 && right_ans == 4) {
                    buttonD.setBackgroundColor(getResources().getColor(R.color.green));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                if(clicked == 4 && right_ans != 4) {
                    buttonD.setBackgroundColor(getResources().getColor(R.color.red));
                    nextbutton.setVisibility(View.VISIBLE);
                    checkbutton.setVisibility(View.INVISIBLE);
                }

                nextbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       /* questiontextview.setText(getResources().getString(R.string.test1question2));
                        checkbutton.setVisibility(View.INVISIBLE);
                        nextbutton.setVisibility(View.INVISIBLE);*/

                        Intent intent = new Intent(Test1Question1.this, Test1Question10.class);
                        startActivity(intent);

                    }
                });


//
            }
        });
    }
    }