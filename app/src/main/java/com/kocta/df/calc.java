package com.kocta.df;

import static java.lang.StrictMath.floor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
public class calc extends AppCompatActivity implements View.OnClickListener {

    TextView statPointstxt, rollBonustxt1, statResulttxt1;
    TextView rollBonustxt2, statResulttxt2;
    MaterialButton buttonPlus1, buttonMinus1, buttonPlus2, buttonMinus2;
    Stats stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        statPointstxt = findViewById(R.id.stat_points_view);
        rollBonustxt1 = findViewById(R.id.bonus_to_roll);
        statResulttxt1 = findViewById(R.id.stat_result);
        buttonPlus1 = findViewById(R.id.button_plus);
        buttonMinus1 = findViewById(R.id.button_minus);
/*        rollBonustxt2 = findViewById(R.id.bonus_to_roll_2);
        statResulttxt2 = findViewById(R.id.stat_result_2);
        buttonPlus2 = findViewById(R.id.button_plus_2);
        buttonMinus2 = findViewById(R.id.button_minus_2);*/

        stats = new Stats(8, 27, Math.floor(8 / 2 - 5), 8, Math.floor(8 / 2 - 5));

        buttonMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease(stats.statNum1, stats.statPoints, stats.bonus1);
                updateUI();
            }
        });
        buttonPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase(stats.statNum1, stats.statPoints, stats.bonus1);
                updateUI();
            }
        });

        buttonMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrease(stats.statNum2, stats.statPoints, stats.bonus2);
                updateUI();
            }
        });
        buttonPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase(stats.statNum2, stats.statPoints, stats.bonus2);
                updateUI();
            }
        });

    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();

    }

    private void updateUI() {
        statPointstxt.setText(String.valueOf((int) stats.statPoints));
        statResulttxt1.setText(String.valueOf((int) stats.statNum1));
        rollBonustxt1.setText(String.valueOf((int) stats.bonus1));
        statResulttxt2.setText(String.valueOf((int) stats.statNum2));
        rollBonustxt2.setText(String.valueOf((int) stats.bonus2));
    }

    public void decrease(double StatValue, double StatPts, double Bns) {
        if (StatValue > 13) {
            StatValue--;
            StatPts = StatPts + 2;
            Bns = Math.floor(StatValue / 2 - 5);
        } else if (StatValue > 8) {
            StatValue--;
            StatPts++;
            Bns = Math.floor(StatValue / 2 - 5);
        }
    }

    private void increase(double statNum, double statPoints, double bonus) {
        if (statNum <= 12 && statPoints > 0) {
            statNum++;
            statPoints--;
            bonus = Math.floor(statNum / 2 - 5);
        } else if (statNum < 15 && statPoints > 1 && statNum > 12) {
            statNum++;
            statPoints = statPoints - 2;
            bonus = Math.floor(statNum / 2 - 5);
        }
    }
}