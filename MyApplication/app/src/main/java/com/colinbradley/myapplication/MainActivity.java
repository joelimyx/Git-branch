package com.colinbradley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Leonardo","June 13, 1960",1));
        actors.add(new Actor("Betty","June 13, 1980",0));
        actors.add(new Actor("Tom Hanks","October 2, 1990",4));
    }
}
