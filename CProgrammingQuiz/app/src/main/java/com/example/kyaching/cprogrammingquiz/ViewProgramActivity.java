package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewProgramActivity extends AppCompatActivity {

    private Button helloworldbuttton,sumoftwobutton,checkprimebutton,findfactorbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_program);

        helloworldbuttton = (Button) findViewById(R.id.helloworldid);
        sumoftwobutton = (Button) findViewById(R.id.sumoftwoid);
        checkprimebutton = (Button) findViewById(R.id.checkprimeid);
        findfactorbutton = (Button) findViewById(R.id.findfactorid);

        helloworldbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ViewProgramActivity.this,helloworld.class);
                startActivity(intent);
            }
        });
        sumoftwobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ViewProgramActivity.this,helloworld.class);
                startActivity(intent);
            }
        });
        checkprimebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ViewProgramActivity.this,helloworld.class);
                startActivity(intent);
            }
        });
        findfactorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ViewProgramActivity.this,helloworld.class);
                startActivity(intent);
            }
        });

    }
}
