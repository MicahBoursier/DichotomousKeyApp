package com.example.boursier57985.dichotomouskeyapp;

import android.app.Application;

import java.util.ArrayList;

public class ThisApp extends Application {
    ArrayList<String> names = new ArrayList<String>(0);
    ArrayList<String> desc = new ArrayList<String>(0);

    public String getName(int i) {
        return names.get(i);
    }

    public String getDesc(int i) {
        return desc.get(i);
    }

    public void addBird(String n, String d) {
        names.add(n);
        desc.add(d);
    }

    public int getLength () {
        return names.size();
    }

    public void deleteBird (int i) {
        if (i <= names.size()) {
            names.remove(i);
            desc.remove(i);
        }
    }
}
