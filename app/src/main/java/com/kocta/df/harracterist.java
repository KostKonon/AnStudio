package com.kocta.df;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class harracterist extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harracterist);

    }
    public void showDialog(View v) {

        AlertDialogHar dialog = new AlertDialogHar();
        dialog.show(getSupportFragmentManager(), "custom");
    }

    public void goBackSecond(View v) {
        Intent intent = new Intent(this, activity_second.class);
        startActivity(intent);
    }
    public void goEqvip(View v) {
        Intent intent = new Intent(this, eqvip.class);
        startActivity(intent);
    }

}