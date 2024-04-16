package com.kocta.df;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, activity_second.class);
        startActivity(intent);
    }

    public void goCalc(View v) {
        Intent intent = new Intent(this, calc.class);
        startActivity(intent);
    }

}