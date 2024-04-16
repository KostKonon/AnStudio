package com.kocta.df;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class eqvip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eqvip);
    }
    public void goBackHar(View v) {
        Intent intent = new Intent(this, harracterist.class);
        startActivity(intent);
    }
    public void goSkills(View v) {
        Intent intent = new Intent(this, skills_and_language.class);
        startActivity(intent);
    }
}