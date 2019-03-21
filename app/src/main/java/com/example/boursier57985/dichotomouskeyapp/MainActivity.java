package com.example.boursier57985.dichotomouskeyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_START_SCREEN = "com.example.DichotomousKeyApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Search1Activity.class);
        intent.putExtra("EXTRA_START_SCREEN", 0);
        startActivity(intent);
    }

    public void goToSpottedBirds(View view) {
        Intent intent = new Intent(this, SpottedBirds.class);
        startActivity(intent);
    }
}