package com.多态.应用.test02;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("员工"+getName()+"正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
