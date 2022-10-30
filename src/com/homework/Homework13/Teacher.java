package com.homework.Homework13;

public class Teacher extends Person{

    private String work_id;

    public Teacher(String name, int age, char gender, String work_id) {
        super(name,age,gender);
        this.work_id = work_id;
    }

    public String getwork_id() {
        return work_id;
    }

    public void setwork_id(String work_id) {
        this.work_id = work_id;
    }
    public void teach(){
        System.out.println("我承诺我会认真教学");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息:");
        System.out.println(super.basicInfo());
        System.out.println("工号:"+work_id);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_id='" + work_id + '\'' +
                '}'+super.toString();
    }
}
