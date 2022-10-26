package com.多态.对象的多态;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点
        //编译类型Animal，运行类型Dog
        Animal animal = new Dog();
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
