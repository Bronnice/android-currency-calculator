package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int currencyRadioChecker = 0;
    int sum = 0;

    TextView rub = findViewById(R.id.rubField);
    TextView eur = findViewById(R.id.eurField);
    TextView dol = findViewById(R.id.dolField);


    public void numAdd(int num) {
        sum += num;
        switch (this.currencyRadioChecker) {
            case (1): {
                rub.append(String.valueOf(num));
            }
            break;
            case (2): {
                eur.append(String.valueOf(num));
            }
            break;
            case (3): {
                dol.append(String.valueOf(num));
            }
            break;
        }
    }

    public void currencyButtonClicked(View view) {
        // если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        // Получаем нажатый переключатель
        switch (view.getId()) {
            case (R.id.rubRadio):
                if (checked) {
                    currencyRadioChecker = 1;
                }
                break;
            case (R.id.eurRadio):
                if (checked) {
                    currencyRadioChecker = 2;
                }
                break;
            case (R.id.dolRadio):
                if (checked) {
                    currencyRadioChecker = 3;
                }
                break;
            }
    }

    public void numOneClicked(View view){
        numAdd(1);
    }

    public void numTwoClicked(View view){
        numAdd(2);
    }

    public void numThirdClicked(View view){
        numAdd(3);
    }

    public void numFourClicked(View view){
        numAdd(4);
    }

    public void numFiveClicked(View view){
        numAdd(5);
    }

    public void numSixClicked(View view){
        numAdd(6);
    }

    public void numSevenClicked(View view){
        numAdd(7);
    }

    public void numEightClicked(View view){
        numAdd(8);
    }

    public void numNineClicked(View view){
        numAdd(9);
    }

    public void numZeroClicked(View view){
        numAdd(0);
    }

    public void calculateClicked(View view){
        }

}