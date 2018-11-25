package com.example.parav.wordify;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dictionary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Dictionary");
    }
}
