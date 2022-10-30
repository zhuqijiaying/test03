package com.homework.Homework13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, int age, char gender, String stu_id) {
        super(name,age,gender);
        this.stu_id = stu_id;
    }

    public String getStu_age() {
        return stu_id;
    }

    public void setStu_age(String stu_age) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺我要好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }
    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(super.basicInfo());
        System.out.println("学号:" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
