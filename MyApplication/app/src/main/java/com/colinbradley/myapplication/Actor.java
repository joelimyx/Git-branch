package com.colinbradley.myapplication;

/**
 * Created by Joe on 11/23/16.
 */

public class Actor {
    private String mName, mDOB;
    private int mOscarWin;

    public Actor(String name, String DOB, int oscarWin) {
        mName = name;
        mDOB = DOB;
        mOscarWin = oscarWin;
    }

    public String getName() {
        return mName;
    }

    public String getDOB() {
        return mDOB;
    }

    public int getOscarWin() {
        return mOscarWin;
    }
}
