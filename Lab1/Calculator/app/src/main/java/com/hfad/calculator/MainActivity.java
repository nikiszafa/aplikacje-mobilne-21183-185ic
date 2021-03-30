package com.hfad.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Calculate calculate = new Calculate();


    public void onClickAdd(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner firstNum = (Spinner) findViewById(R.id.firstNum);
        Spinner secondNum = (Spinner) findViewById(R.id.secondNum);

        String selectedFirst = String.valueOf(firstNum.getSelectedItem());
        String selectedSecond = String.valueOf(secondNum.getSelectedItem());

        StringBuilder resultFormatted = new StringBuilder();
        resultFormatted.append("Wynik sumy liczby ").append(selectedFirst).append(" oraz liczby ")
                .append(selectedSecond).append(" to ").append(calculate.add(selectedFirst, selectedSecond));

        result.setText(resultFormatted);
    }

    public void onClickSubstract(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner firstNum = (Spinner) findViewById(R.id.firstNum);
        Spinner secondNum = (Spinner) findViewById(R.id.secondNum);

        String selectedFirst = String.valueOf(firstNum.getSelectedItem());
        String selectedSecond = String.valueOf(secondNum.getSelectedItem());

        StringBuilder resultFormatted = new StringBuilder();
        resultFormatted.append("Wynik odejmowania od liczby ").append(selectedFirst).append(" liczby ")
                .append(selectedSecond).append(" to ").append(calculate.substract(selectedFirst, selectedSecond));

        result.setText(resultFormatted);
    }

    public void onClickMultiply(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner firstNum = (Spinner) findViewById(R.id.firstNum);
        Spinner secondNum = (Spinner) findViewById(R.id.secondNum);

        String selectedFirst = String.valueOf(firstNum.getSelectedItem());
        String selectedSecond = String.valueOf(secondNum.getSelectedItem());

        StringBuilder resultFormatted = new StringBuilder();
        resultFormatted.append("Wynik mnożenia liczby ").append(selectedFirst).append(" oraz liczby ")
                .append(selectedSecond).append(" to ").append(calculate.multiply(selectedFirst, selectedSecond));

        result.setText(resultFormatted);
    }

    public void onClickDivide(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner firstNum = (Spinner) findViewById(R.id.firstNum);
        Spinner secondNum = (Spinner) findViewById(R.id.secondNum);

        String selectedFirst = String.valueOf(firstNum.getSelectedItem());
        String selectedSecond = String.valueOf(secondNum.getSelectedItem());

        StringBuilder resultFormatted = new StringBuilder();
        resultFormatted.append("Wynik dzielenia liczby ").append(selectedFirst).append(" przez liczbę ")
                .append(selectedSecond).append(" to ").append(calculate.divide(selectedFirst, selectedSecond));

        result.setText(resultFormatted);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}