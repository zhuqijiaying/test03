package comSix_集合.Homework11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zq
 */
/*
使用ArrayList 完成对 对象Car (name，price)的各种操作
1.add：添加单个元素
2.remove:删除指定元素 Car car =new Car("宝马”，400000);
3.contains:查找元素是否存在 Car car2= new Car("宾利”，5000000);
4.size：获取元素个数
5.isEmpty:判断是否为空 I
6.clear：清空
7.addAll：添加多个元素
8.containsAll:查找多个元素是否都存在
9.removeAll：删除多个元素
使用增强for和 迭代器来遍历所有的car，需要重写Car的toString方法

 */
public class Homework02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马",1000000);
        Car car2 = new Car("奥迪",2000000);
        List list = new ArrayList();
        list.add(car1);
        list.add(car2);
        list.add(new Car("奔驰",20000000));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains("奔驰"));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        //list.clear();
        //System.out.println(list);

        list.addAll(list);
        System.out.println(list);

//        list.removeAll(list);
//        System.out.println(list);

        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println("========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}