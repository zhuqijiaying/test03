package com.多态.应用.test01;

public class Teacher01 extends Person{
    private double salary;

    public Teacher01(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+" salary="+salary;
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在讲课");
    }
}
