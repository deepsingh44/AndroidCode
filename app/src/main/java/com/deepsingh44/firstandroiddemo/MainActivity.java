package com.deepsingh44.firstandroiddemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //attach a layout to your activity
        setContentView(R.layout.activity_main);
        setTitle("MainActivity");

    }

    public void submit(View a){
        //Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,Second.class);
        startActivity(in);
    }


}

