package com.kylestewart.dicefinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ThreeDice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_dice);

        final Button button = (Button) findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Dice dice1 = new Dice();
                Dice dice2 = new Dice();
                Dice dice3 = new Dice();

                ImageView dice1Image = (ImageView) findViewById(R.id.dice1);
                ImageView dice2Image = (ImageView) findViewById(R.id.dice2);
                ImageView dice3Image = (ImageView) findViewById(R.id.dice3);

                dice1.rollDice(dice1Image);
                dice2.rollDice(dice2Image);
                dice3.rollDice(dice3Image);

                TextView totalRoll = (TextView) findViewById(R.id.total);

                totalRoll.setText("Roll value is " + String.valueOf(dice1.getRoll() + dice2.getRoll() + dice3.getRoll()));

            }
        });

    }
}
