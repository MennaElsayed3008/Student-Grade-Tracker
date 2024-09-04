package com.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private int ID;
    private double score;
    public static ArrayList <Student> studentList = new ArrayList<>();
    
    public Student(String n , int id, double s){
        name = n;
        ID = id;
        score = s;
        studentList.add(this);
    }
    

    public void setname(String n){
        name = n;
    }

    public void setID(int id){
        ID = id;
    }

    public void setscore(double s){
        score = s;
    }

    public double getscore(){
        return score;
    }

    public String getname(){
        return name;
    }
    
    public int getID(){
        return ID;
    }

    public static double calcAvgScore(){
        double sum=0;
        double avg=0;
        for (int i=0 ; i<studentList.size(); i++)
            sum = sum + studentList.get(i).score;
        avg = sum/studentList.size();
        return avg;
    }

    public static double getHighScore(){
        double highest = 0;
        for (int i=0 ; i<studentList.size(); i++)
            if(studentList.get(i).score > highest)
                highest = studentList.get(i).score;
        return highest;
    }
    public static double getLowScore(){
        double lowest = studentList.get(0).score;
        for (int i=0 ; i<studentList.size(); i++)
            if(studentList.get(i).score < lowest)
                lowest = studentList.get(i).score;
        return lowest;
    }
    
}
