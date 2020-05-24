package com.example.dafyomilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DafYomiCalculator dafYomiCalculator = new DafYomiCalculator();
        DafYomiDetailes todayDafYomiDetailes = dafYomiCalculator.getTodayDafYomi(this);

        DafYomiDetailes dafYomiDetailes = dafYomiCalculator.getDafYomiByDay(this, 2020, 5, 25);



    }







}
