package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test1Question10 extends AppCompatActivity {

    private Button button;
    private TextView questiontextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1_question10);

        button = (Button)  findViewById(R.id.opencameraid);
        questiontextview = (TextView) findViewById(R.id.questiontextviewid) ;
        questiontextview.setText(getResources().getString(R.string.test1question2));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCamera();
            }
        });
    }

    private void openCamera() {
        Intent intent = new Intent(Test1Question10.this,Camera.class);
        startActivity(intent);
    }
}
