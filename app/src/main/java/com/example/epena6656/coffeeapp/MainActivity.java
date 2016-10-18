package com.example.epena6656.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //When button is pressed the number is increased by one
    public void pLar(View v){
        TextView lNum = (TextView) findViewById(R.id.lNum);
        Integer current = Integer.parseInt(lNum.getText().toString());
        lNum.setText("" + (current + 1));
    }
    //When button is pressed the number is decreased by one
    public void mLar(View v){
        TextView lNum = (TextView) findViewById(R.id.lNum);
        Integer current = Integer.parseInt(lNum.getText().toString());
        lNum.setText("" + (current - 1));
    }
    //When button is pressed the number is increased by one
    public void pMed(View v){
        TextView mNum = (TextView) findViewById(R.id.mNum);
        Integer current = Integer.parseInt(mNum.getText().toString());
        mNum.setText("" + (current + 1));
    }
    //When button is pressed the number is decreased by one
    public void mMed(View v){
        TextView mNum = (TextView) findViewById(R.id.mNum);
        Integer current = Integer.parseInt(mNum.getText().toString());
        mNum.setText("" + (current - 1));
    }
    //When button is pressed the number is increased by one
    public void pSma(View v){
        TextView sNum = (TextView) findViewById(R.id.sNum);
        Integer current = Integer.parseInt(sNum.getText().toString());
        sNum.setText("" + (current + 1));
    }
    //When button is pressed the number is decreased by one
    public void mSma(View v){
        TextView sNum = (TextView) findViewById(R.id.sNum);
        Integer current = Integer.parseInt(sNum.getText().toString());
        sNum.setText("" + (current - 1));
    }
    public void getTotal(View v) {
        TextView theTotal = (TextView) findViewById(R.id.total);
        TextView lNum = (TextView) findViewById(R.id.lNum);
        TextView mNum = (TextView) findViewById(R.id.mNum);
        TextView sNum = (TextView) findViewById(R.id.sNum);
        Double numLarge = Double.parseDouble(lNum.getText().toString());
        Double numMedium = Double.parseDouble(mNum.getText().toString());
        Double numSmall = Double.parseDouble(sNum.getText().toString());
        theTotal.setText("$" + ((numLarge*3.5) + (numMedium*3) + (numSmall*2.5)));

    }

}
