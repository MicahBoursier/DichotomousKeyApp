package com.example.boursier57985.dichotomouskeyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
