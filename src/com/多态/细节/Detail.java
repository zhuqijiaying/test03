package com.多态.细节;

public class Detail {
    public static void main(String[] args) {
        Base base = new Sub();//向上转性
        System.out.println(base.count);//看编译类型
        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}
class Base{
    int count = 10;//属性
}
class Sub extends Base{
    int count = 20;//属性
}