package com.example.mainpic;

public class Person {
    String part;
    String motion;
    int resId;
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getMotion() {
        return motion;
    }
    public int getResId() {
        return resId;
    }
    public void setResId(int resId) {
        this.resId = resId;
    }

    public void getMotion(String motion) {
        this.motion = motion;
    }

    public Person(String part, String motion,int resId) {
        this.part = part;
        this.motion = motion;
        this.resId = resId;
    }


}
