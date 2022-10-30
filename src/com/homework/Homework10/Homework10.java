package com.homework.Homework10;

import java.util.Objects;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",34,"讨口子",'男',0);
        Doctor doctor2 = new Doctor("jack",34,"讨口子",'男',0);
        System.out.println(doctor1.equals(doctor2));

        Animal animal = new Animal("韩顺平教育");
        Animal animal1 = new Animal("韩顺平教育");
        System.out.println(animal.equals(animal1));
    }
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }

}