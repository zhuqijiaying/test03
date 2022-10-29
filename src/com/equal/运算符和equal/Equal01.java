package com.equal.运算符和equal;

public class Equal01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        //==:是一个比较运算符
        //==:既可以判断基本类型，又可以判断引用类型
        //==:如果判断基本类型，判断的是值是否相等
        //==:如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象
        System.out.println(a==c);
        System.out.println(b==c);
        //父类引用也可以
        B object = a;
        System.out.println(object==c);


        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1==num2);
        "hello".equals("hello");

        Integer integer = new Integer(313);
        Integer integer1 = new Integer(313);
        System.out.println(integer.equals(integer1));

        
    }
}
class A extends B{}
class B{}
