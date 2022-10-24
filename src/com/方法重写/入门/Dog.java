package com.方法重写.入门;

import com.方法重写.入门.Animal;

public class Dog extends Animal {
    public void cry(){
        //1.因为Dog是Animal的子类
        //2.Dog的cry方法和Animal的cry定义形式一样（名称、返回参数、参数）
        //3.这时我们就说Dog的cry方法，重写了Animal的cry方法
        System.out.println("小狗汪汪叫。。。");
    }
}
