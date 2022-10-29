package com.debug;
//演示debug对象创建的过程
public class Debugtest {
    public static void main(String[] args) {
        Person person = new Person("jack",20);
        System.out.println(person);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}