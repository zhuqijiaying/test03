package com.toString;

public class ToString {
    public static void main(String[] args) {
        /*Object的toString原码
        （1）getClass().getName()  类的全类名(包名+类名)
        （2）Integer.toHexString(hashCode()) 将对象的hashCode值转为16进制字符串
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
        Monster monster = new Monster("jack","巡山",2);
        System.out.println(monster.toString());
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //重写toString方法

    @Override
    public String toString() {//重写后，默认输出属性
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
