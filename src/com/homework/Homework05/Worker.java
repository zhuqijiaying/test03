package com.homework.Homework05;

public class Worker extends Employee{
    public Worker(double salary) {
        super(salary);
    }

    @Override
    public void dy() {
        System.out.println("工人工资");
        super.dy();
    }
}
