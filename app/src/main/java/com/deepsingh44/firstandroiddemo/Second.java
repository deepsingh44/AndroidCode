package com.deepsingh44.firstandroiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_demo);
        setTitle("Second Activity");

    }

    public void submit(View v){
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}
