package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BeginnerLevelActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7;

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_level);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Begineer");

        button1=(Button) findViewById(R.id.test1);
        button2=(Button)findViewById(R.id.test2);
        button3=(Button)findViewById(R.id.test3);
        button4=(Button)findViewById(R.id.test4);
        button5=(Button)findViewById(R.id.test5);
        button6=(Button)findViewById(R.id.test6);
        button7=(Button)findViewById(R.id.test7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuizQuestion();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeginnerLevelActivity.this,Test1Question1.class);
                startActivity(intent);
            }
        });
    }

    private void openQuizQuestion() {
        Intent intent =new Intent(this,Test1Question1.class);
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
                startActivity(new Intent(BeginnerLevelActivity.this,ScoreBoardActivity.class ));
                break;

        }
        return true;
    }
}
