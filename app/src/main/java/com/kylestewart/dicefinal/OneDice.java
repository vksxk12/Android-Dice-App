package com.kylestewart.dicefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OneDice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_dice);

        final Button button = (Button) findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Dice dice1 = new Dice();

                ImageView dice1Image = (ImageView) findViewById(R.id.dice1);

                dice1.rollDice(dice1Image);

                TextView totalRoll = (TextView) findViewById(R.id.total);

                totalRoll.setText("Roll value is " + String.valueOf(dice1.getRoll()));

            }
        });

        final Button endButton = (Button) findViewById(R.id.finishButton);
        endButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();

            }
        });
    }
}
