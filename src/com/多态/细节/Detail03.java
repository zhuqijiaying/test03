package com.多态.细节;

public class Detail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        //instanceof比较操作符用于判断对象的运行类型是否为XX类型或XX类型的子类
        System.out.println(bb instanceof  BB);//true
        System.out.println(bb instanceof  AA);//true

        AA aa = new BB();
        //判断aa是否为后面类型子类型
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object object = new Object();
        System.out.println(object instanceof AA);


    }
}
class AA{}//父类
class BB extends AA{}//子类