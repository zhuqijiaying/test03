package com.多态.向下转型;

public class Cat extends Animal {
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//cat特有方法
        System.out.println("猫抓老鼠");
    }
}
