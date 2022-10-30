package com.homework.Homework04;

public class Manger extends Workers{
    private double bonus;
    public Manger(String name, double daySalary, int days, double grade) {
        super(name, daySalary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void dy() {
        System.out.println("经理:"+getName()+"工资="+(bonus+getDays()*getDaySalary()*getGrade()));
    }
}

