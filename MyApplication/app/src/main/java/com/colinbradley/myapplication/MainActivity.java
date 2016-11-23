package com.colinbradley.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Actor> actorList = new LinkedList<>();
        actorList.add(1,new Actor("Johnny Depp", "idk", 7));
        actorList.add(2, new Actor("Matt Damon", "some time in the past", 1));
        actorList.add(3, new Actor("Bob, just Bob", "yesterday", 285));
    }
}
