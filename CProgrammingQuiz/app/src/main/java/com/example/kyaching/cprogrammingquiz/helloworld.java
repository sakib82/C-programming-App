package com.example.kyaching.cprogrammingquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class helloworld extends AppCompatActivity {

    private TextView programnameviewe,programcodeview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        programnameviewe = (TextView) findViewById(R.id.programname);
        programcodeview = (TextView) findViewById(R.id.programcode);

        programnameviewe.setText("Hello World");
        programcodeview.setText(getResources().getText(R.string.helloworld));


    }
}
