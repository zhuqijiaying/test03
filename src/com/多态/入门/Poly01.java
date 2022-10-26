package com.多态.入门;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("张三");

        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        master.feed(dog,bone);


        Cat cat = new Cat("小猫");
        Fish fish = new Fish("小黄鱼");
        master.feed(cat,fish);

        Pig pig = new Pig("花花");
        Rice rice = new Rice("白米饭");
        master.feed(pig,rice);
    }
}
