package com.bugsnguns.revolutfx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExchangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        new ParseTask().execute();
    }
}
