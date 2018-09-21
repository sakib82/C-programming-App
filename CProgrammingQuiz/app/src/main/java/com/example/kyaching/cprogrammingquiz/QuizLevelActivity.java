package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class QuizLevelActivity extends AppCompatActivity {
    private Button button1,button2,button3;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_level);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quiz Level");

        button1=(Button)findViewById(R.id.begginerbutton);
        button2=(Button)findViewById(R.id.intermidiatebutton);
        button3=(Button)findViewById(R.id.expertbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBeginnerLevel();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizLevelActivity.this,BeginnerLevelActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizLevelActivity.this,BeginnerLevelActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openBeginnerLevel() {
        Intent intent=new Intent(this,BeginnerLevelActivity.class);
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
                startActivity(new Intent(QuizLevelActivity.this,ScoreBoardActivity.class ));
                break;

        }
        return true;
    }

}
