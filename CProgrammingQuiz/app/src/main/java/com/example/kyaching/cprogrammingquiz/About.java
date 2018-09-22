package com.example.kyaching.cprogrammingquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private TextView aboutinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutinfo = (TextView) findViewById(R.id.abouttext);
        aboutinfo.setText(getResources().getText(R.string.about));

    }
}
