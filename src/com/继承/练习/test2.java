package com.继承.练习;

public class test2 {
    public static void main(String[] args) {
        C1 c1 = new C1();
    }
}
class A1{
    public A1(){
        System.out.println("我是A类");
    }
}
class B1 extends A1{
    public B1(){
        System.out.println("我是B类的无参构造");
    }
    public B1(String name){
        //默认super
        System.out.println("我是B类的有参构造");
    }
}
class C1 extends B1{
    public C1(){
        this("hello");
        System.out.println("我是C类无参构造");
    }
    public C1(String name){
        super("hhhhh");
        System.out.println("我是C类的有参构造");
    }
}
