package com.example.databsehandling;

public class stud {

    String sname;

    int sroll;

    public stud(int sroll,String sname){
        this.sroll=sroll;
        this.sname=sname;
    }

    public stud() {

    }

    public String getSname(){
        return sname;
    }

    public void  setSname(String sname){
        this.sname=sname;
    }
    public int getSroll(){
        return sroll;
    }
    public void setSroll(int sroll){
        this.sroll=sroll;
    }

}
