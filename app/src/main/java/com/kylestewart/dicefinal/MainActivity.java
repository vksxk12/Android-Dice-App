package com.kylestewart.dicefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);

        np.setMinValue(1);
        np.setMaxValue(4);
        np.setWrapSelectorWheel(true);

        Button button = (Button) findViewById(R.id.goButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int pickedValue = np.getValue();

                if (pickedValue == 1) {
                    Intent i = new Intent(getApplicationContext(), OneDice.class);
                    startActivity(i);
                } else if (pickedValue == 2){
                    Intent i = new Intent(getApplicationContext(), TwoDice.class);
                    startActivity(i);
                } else if (pickedValue == 3){
                    Intent i = new Intent(getApplicationContext(), ThreeDice.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(getApplicationContext(), FourDice.class);
                    startActivity(i);
                }

            }
        });


    }
}
