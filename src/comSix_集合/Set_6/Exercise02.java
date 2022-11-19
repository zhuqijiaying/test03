package comSix_集合.Set_6;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author zq
 */
public class Exercise02 {
    public static void main(String[] args) {
        Employees employees1 = new Employees("jack",new MyDate(2000,12,12));
        Employees employees2 = new Employees("jake",new MyDate(2000,12,12));
        Employees employees3 = new Employees("jack",new MyDate(2000,12,12));
        HashSet hashSet = new HashSet();
        hashSet.add(employees1);
        hashSet.add(employees2);
        hashSet.add(employees3);
        System.out.println(hashSet);
    }
}
class Employees{
    private String name;
    private MyDate birther;

    public Employees(String name, MyDate birther) {
        this.name = name;
        this.birther = birther;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirther() {
        return birther;
    }

    public void setBirther(MyDate birther) {
        this.birther = birther;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", birther=" + birther +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(name, employees.name) &&
                Objects.equals(birther, employees.birther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birther);
    }
}
class MyDate{
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
                 year +
                "-" + month +
                "-" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}