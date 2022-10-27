package com.继承;

public class Graducate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(int age) {
        System.out.println("bys"+name+"正在考试");
    }
    public void showinfo(){
        System.out.println("名字"+name+"年龄"+age+"成绩"+score);
    }
}
