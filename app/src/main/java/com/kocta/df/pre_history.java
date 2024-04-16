package com.kocta.df;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pre_history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_history);
    }
    public void goBackSkills(View v) {
        Intent intent = new Intent(this, skills_and_language.class);
        startActivity(intent);
    }
}