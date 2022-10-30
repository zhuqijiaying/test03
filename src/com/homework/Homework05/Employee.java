package com.homework.Homework05;

public class Employee {
    private double salary;//基本工资


    public Employee(double salary) {
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void dy(){
        System.out.println("工资= "+salary*12);

    }
}
