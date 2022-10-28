package com.super关键字;

public class B extends A{
    //super不能访问父类的private属性
    public void hi(){
        System.out.println(super.n1+""+super.n2+""+super.n3);
    }
    public void ok(){
        //super不能访问父类private方法
        super.test100();
        super.test200();
        super.test300();
    }

}
