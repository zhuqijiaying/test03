package com.访问修饰符;

public class B {
    public void say(){
        A a = new A();
        //在同一个包，可以访问public，protected 和 默认，不能访问private
        System.out.println("n1="+a.n1+" n2="+a.n2+" n3="+a.n3);
    }
}
