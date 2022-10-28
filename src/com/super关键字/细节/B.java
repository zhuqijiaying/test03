package com.super关键字.细节;

public class B extends A {
    public int n1 = 200;
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
    public void cal(){
        System.out.println("B类的cal方法");
    }
    public void sum(){
        System.out.println("B类sum方法");
        //调用父类A的cal方法
        //cal();//先本类查找，再找父类
        this.cal();//等价于cal()
        //super.cal();//直接查找父类

        //属性查找，先找本类，找到就输出，没找到就找父类
        System.out.println(n1);
        System.out.println(this.n1);
        //直接查找父类属性
        System.out.println(super.n1);

    }
    //就近查找，先查找父类A，父类A没有就查找父类Base
    public void test(){
        System.out.println("super.n1"+super.n1);
    }
}
