package com.homework.Homework05;

public class Peasant extends Employee{
    public Peasant(double salary) {
        super(salary);
    }

    @Override
    public void dy() {
        System.out.println("农民工资");
        super.dy();
    }
}
