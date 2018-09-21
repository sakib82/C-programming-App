package com.example.kyaching.cprogrammingquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LearnCActivity extends AppCompatActivity {
    Toolbar toolbar;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_c);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn C");

        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(LearnCActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.C_programming));

        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(LearnCActivity.this,LearnC2Activity.class);
                intent.putExtra("CProgramming",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

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
                startActivity(new Intent(LearnCActivity.this,ScoreBoardActivity.class ));
                break;

        }
        return true;
    }
}
