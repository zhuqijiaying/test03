package com.多态.应用.test01;

public class Student01 extends Person{
    private double score;

    public Student01(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+" score="+score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }
}
