package com.kocta.df;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class skills_and_language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills_and_language);
    }
    public void goBackEqvip(View v) {
        Intent intent = new Intent(this, eqvip.class);
        startActivity(intent);
    }
    public void showDialogSlills(View v) {

        AlertDialogSkills dialog = new AlertDialogSkills();
        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void goHistory(View v) {
        Intent intent = new Intent(this, pre_history.class);
        startActivity(intent);
    }
}