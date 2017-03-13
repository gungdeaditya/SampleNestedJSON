package com.example.gungde.samplenestedjson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPath(View v){
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }

    public void buttonQuery(View v){
        startActivity(new Intent(MainActivity.this,Main3Activity.class));
    }
}
