package com.example.boursier57985.dichotomouskeyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BirdScreen extends AppCompatActivity {
    public static final String EXTRA_START_SCREEN = "com.example.DichotomousKeyApp.MESSAGE";

    private Integer lastScr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("EXTRA_NAME");
        String desc = extras.getString("EXTRA_DESC");
        Integer scr = extras.getInt("EXTRA_SCR");
        String img = (extras.getString("EXTRA_IMG")).toLowerCase();
        int id = getResources().getIdentifier(img, "drawable", getPackageName());
        lastScr = scr;
        TextView nameView = findViewById(R.id.nameView);
        nameView.setText(name);
        TextView descView = findViewById(R.id.descView);
        descView.setText(desc);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(id);
        ((ThisApp) this.getApplication()).addBird(name, desc);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.back) {
            sendMessage();
        }else{
            GoHome();
        }

        return super.onOptionsItemSelected(item);
    }


    public void sendMessage() {
        Intent intent = new Intent(this, Search1Activity.class);
        intent.putExtra("EXTRA_START_SCREEN", lastScr);
        startActivity(intent);
    }

    public void GoHome() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
