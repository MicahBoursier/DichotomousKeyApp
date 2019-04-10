package com.example.boursier57985.dichotomouskeyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SpottedBirds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotted_birds);
        TextView nameAView = findViewById(R.id.nameA);
        TextView descAView = findViewById(R.id.descriptionA);
        TextView nameBView = findViewById(R.id.nameB);
        TextView descBView = findViewById(R.id.descriptionB);
        TextView nameCView = findViewById(R.id.nameC);
        TextView descCView = findViewById(R.id.descriptionC);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if ((((ThisApp) this.getApplication()).getLength()) >= 3) {
            nameAView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 1));
            descAView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 1));
            nameBView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 2));
            descBView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 2));
            nameCView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 3));
            descCView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 3));
        } else if ((((ThisApp) this.getApplication()).getLength()) == 2) {
            nameAView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 1));
            descAView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 1));
            nameBView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 2));
            descBView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 2));
        } else if ((((ThisApp) this.getApplication()).getLength()) == 1) {
            nameAView.setText(((ThisApp) this.getApplication()).getName((((ThisApp) this.getApplication()).getLength()) - 1));
            descAView.setText(((ThisApp) this.getApplication()).getDesc((((ThisApp) this.getApplication()).getLength()) - 1));
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.back);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            sendMessage();
        }

        return super.onOptionsItemSelected(item);
    }
    public void backToMenu (View view) {
        sendMessage();
    }

    public void sendMessage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
