package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView rub, eur, dol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rub = findViewById(R.id.rubField);
        eur = findViewById(R.id.eurField);
        dol = findViewById(R.id.dolField);

        RadioButton rb = findViewById(R.id.rubRadio);
        rb.setChecked(true);
    }

    int currencyRadioChecker = 1;

    public void numAdd(int num) {
        System.out.println("нажата " + num);
        switch (this.currencyRadioChecker) {
            case (1): {
                rub.setText(rub.getText() + String.valueOf(num));
            }
            break;
            case (2): {
                eur.setText(eur.getText() + String.valueOf(num));
            }
            break;
            case (3): {
                dol.setText(dol.getText() + String.valueOf(num));
            }
            break;
        }
    }

    public void currencyButtonClicked(View view) {
        rub.setText("");
        eur.setText("");
        dol.setText("");

        // если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        System.out.println("выбран " + currencyRadioChecker + " режим");

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
        double temporarySum;
        switch (this.currencyRadioChecker) {
            case (1): {
                temporarySum = Double.parseDouble(String.valueOf(rub.getText())) / 59.0;
                eur.setText(temporarySum + "");
                temporarySum = Double.parseDouble(String.valueOf(rub.getText())) / 60.0;
                dol.setText((temporarySum) + "");
            }
            break;
            case (2): {
                temporarySum = Double.parseDouble(String.valueOf(eur.getText())) / 0.017;
                rub.setText(temporarySum + "");
                temporarySum = Double.parseDouble(String.valueOf(eur.getText())) * 0.99;
                dol.setText(temporarySum  + "");
            }
            break;
            case (3): {
                temporarySum = Double.parseDouble(String.valueOf(dol.getText())) / 0.017;
                rub.setText(temporarySum + "");
                temporarySum = Double.parseDouble(String.valueOf(dol.getText())) * 1.01;
                eur.setText(temporarySum + "");
            }
            break;
        }
        }

    public void cleanClicked(View view){
        rub.setText("");
        eur.setText("");
        dol.setText("");
        System.out.println("строки очищены");
    }
}