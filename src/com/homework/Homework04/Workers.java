package com.homework.Homework04;

public class Workers {
    private String name;
    private double daySalary;
    private int days;
    private double grade;

    public Workers(String name, double daySalary, int days, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void dy(){
        System.out.println("name= "+name+"单日工资 "+daySalary+"天数 "+days+"工资= "+daySalary*days*grade);
    }
}
