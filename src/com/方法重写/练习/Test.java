package com.方法重写.练习;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        System.out.println(person.say());

        Student student = new Student("cat",10,1201210,300);
        System.out.println(student.say());
    }
}
