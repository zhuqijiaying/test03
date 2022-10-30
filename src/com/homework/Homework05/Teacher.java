package com.homework.Homework05;

public class Teacher extends Employee{
    private double bonus;
    public Teacher(double salary) {
        super(salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void dy() {
        System.out.println("老师工资= "+(getSalary()*12+bonus));
    }
}
