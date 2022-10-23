package com.继承.本质;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getAge());
    }
}
class GrandPa{
    String name = "大头爷爷";
    int age = 72;
    String hobby = "旅游";
}
class Father extends GrandPa{
    String name ="大头爸爸";
    private int age = 39;
//私有属性和方法不能在子类直接访问，通过父类提供公共的方法去访问
    public int getAge() {
        return age;
    }
}
class Son extends Father{
    String name="大头儿子";
}
