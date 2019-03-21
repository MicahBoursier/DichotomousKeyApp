package com.example.boursier57985.dichotomouskeyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BirdScreen extends AppCompatActivity {
    public static final String EXTRA_START_SCREEN = "com.example.DichotomousKeyApp.MESSAGE";

    private Integer lastScr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_screen);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("EXTRA_NAME");
        String desc = extras.getString("EXTRA_DESC");
        Integer scr = extras.getInt("EXTRA_SCR");
        lastScr = scr;
        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(name);
        TextView descView = findViewById(R.id.descView);
        descView.setText(desc);
        ((ThisApp) this.getApplication()).addBird(name, desc);
    }

    public void backToSearch (View view) {
        sendMessage(view);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Search1Activity.class);
        intent.putExtra("EXTRA_START_SCREEN", lastScr);
        startActivity(intent);
    }
}
