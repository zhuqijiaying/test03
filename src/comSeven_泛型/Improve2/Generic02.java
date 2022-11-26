package comSeven_泛型.Improve2;

import java.util.ArrayList;

/**
 * @author zq
 */
public class Generic02 {
    public static void main(String[] args) {
        //ArrayList<Dog>表示存放到ArrayList集合中的元素是Dog类型
        //如果编译器发现添加的类型，不满足要求，就会报错
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new comSeven_泛型.Improve2.Dog("小黄",12));
        arrayList.add(new comSeven_泛型.Improve2.Dog("小蓝",13));
        arrayList.add(new comSeven_泛型.Improve2.Dog("小红",14));
        //arrayList.add(new comSeven_泛型.Improve2.Cat("小花",12));
        for (Dog o :arrayList) {
            System.out.println(o.getName()+o.getAge());
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}