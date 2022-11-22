package comSix_集合.Homework11;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author zq
 */
public class Homework05 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person aa = new Person(1000, "AA");
        Person bb = new Person(2000, "BB");
        hashSet.add(aa);
        hashSet.add(bb);
        aa.name = "CC";//关键，将CC赋予，（1000，CC）不在原来位置上，在其他地方
        hashSet.remove(aa);//在删除aa的时候，是找的1000，(1000，CC)不在原来位置上，在其他地方
        System.out.println(hashSet);
        hashSet.add(new Person(1000,"CC"));
        System.out.println(hashSet);
        hashSet.add(new Person(1000,"AA"));
        System.out.println(hashSet);
    }
}
class Person{
    public int num;
    public String name;

    public Person(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return num == person.num &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}