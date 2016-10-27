package com.kylestewart.dicefinal;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by kylestewart on 8/5/16.
 */
public class Dice extends AppCompatActivity {

    private int roll;

    public static int rollResult() {

        Random randomGenerator = new Random();

        int randomNum = randomGenerator.nextInt(6) + 1;

        return randomNum;

    }

    public void rollDice(ImageView imageView) {

        roll = Dice.rollResult();

        if (roll == 1) {
            imageView.setImageResource(R.drawable.dice_1);

        } else if (roll == 2) {
            imageView.setImageResource(R.drawable.dice_2);

        } else if (roll == 3) {
            imageView.setImageResource(R.drawable.dice_3);

        } else if (roll == 4) {
            imageView.setImageResource(R.drawable.dice_4);

        } else if (roll == 5) {
            imageView.setImageResource(R.drawable.dice_5);

        } else if (roll == 6) {
            imageView.setImageResource(R.drawable.dice_6);

        }

    }

    public int getRoll() { return roll;}

}