package comSeven_泛型;

import java.util.ArrayList;

/**
 * @author zq
 */
public class Generic01 {
    public static void main(String[] args) {
        //传统添加
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黄",12));
        arrayList.add(new Dog("小蓝",13));
        arrayList.add(new Dog("小红",14));
        arrayList.add(new Cat("小花",12));
        for (Object o :arrayList) {
            //向下转型
            Dog o1 = (Dog) o;
            System.out.println(o1.getName()+o1.getAge());
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