package com.封装.入门;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackttt");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());
        person.getSalary();
        Person smith = new Person("smith",880,40000);
        System.out.println("======smith的信息=======");
        System.out.println(smith.info());
    }

}
class Person{
    public String name;//名字公开
    private int age;//年龄私有
    private double salary;//工资私有
    //构造器
    public Person() {

    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setSalary(salary);
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验,相当于增加了业务逻辑
        if (name.length()>=2&&name.length()<=6){
            this.name = name;
        }else{
            System.out.println("名字长度不对，默认为无名");
            this.name="无名";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if(age>=1 && age<=120){
            this.age=age;
        }else{
            System.out.println("年龄需在1-120之间");
            this.age=18;//设置默认年龄
        }

    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info(){
        return "信息为 name="+name+" age="+age+" 薪水="+salary;
    }
}
