package comSeven_泛型;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zq
 */
/*
定义Employee类
    (1)该类包含：private成员变量name，sal，birthday，其中birthday为MyDate类的对象；
    (2)为每一个属性定义 getter,setter方法；
    (3)重写 toString 方法输出 name,sal,birthday
    (4) MyDate类包含：private成员变量month，day.year；并为每一个属性定义gettersetter 方法；
    (5)创建该类的3个对象，并把这些对象放入ArrayList集合中(ArrayList需使用泛型来定义），对集合中的元素进行排序，并遍历输出： 教
    排序方式：调用ArrayList的sort 方法，传入Comparator对象[使用泛型]，先按照name排序，如果name相同，则按生日日期的先后排序。 【即：定制排序】
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("jrck",5000,new MyDate(2000,23,23));
        Employee employee2 = new Employee("jack",4000,new MyDate(2001,23,23));
        Employee employee3 = new Employee("jack",3000,new MyDate(2002,23,23));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
        System.out.println("===========排序========");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    return 0;
                }
                //比较name,名字不同就返回i
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
                return employee1.getBirthday().compareTo(employee2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {


        int yearMinus = year - o.getYear();
        if(yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month -o.getMonth();
        if(monthMinus != 0){
            return monthMinus;
        }
        return day - o.getDay();
    }
}