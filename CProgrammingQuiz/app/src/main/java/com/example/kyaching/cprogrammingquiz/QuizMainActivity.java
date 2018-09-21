package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class QuizMainActivity extends AppCompatActivity {
    private Button button, button1,button3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("C programming Quiz");

        button = (Button) findViewById(R.id.buttonquiz1);
        button1 = (Button) findViewById(R.id.buttonquiz2);
        button3=(Button)findViewById(R.id.buttonquiz3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLearnC();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuizLevel();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSampleProgram();
            }
        });

    }

    private void openSampleProgram() {
        Intent intent =new Intent(this,ViewProgramActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.score:
                startActivity(new Intent(QuizMainActivity.this,ScoreBoardActivity.class ));
                break;

        }
        return true;
    }

    public void openLearnC() {
        Intent intent = new Intent(this, LearnCActivity.class);
        startActivity(intent);
    }

    public void openQuizLevel() {
        Intent intent = new Intent(this, QuizLevelActivity.class);
        startActivity(intent);
    }

}

