package com.homework.Homework05;

public class Scientist extends Employee{
    private double remuneration;
    public Scientist(double salary) {
        super(salary);
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    @Override
    public void dy() {
        System.out.println("科学家工资= "+(getSalary()*12+remuneration));
    }
}
