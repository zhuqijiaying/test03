package com.homework.Homework05;

public class Waiter extends Employee{
    public Waiter(double salary) {
        super(salary);
    }

    @Override
    public void dy() {
        System.out.println("服务员工资");
        super.dy();
    }
}
