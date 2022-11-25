package comSeven_泛型;

import java.util.*;

/**
 * @author zq
 */
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型给HashSet放入3个学生对象
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",34));
        students.add(new Student("july",35));
        students.add(new Student("duck",36));
        for (Student studdent :students) {
            System.out.println(studdent);
        }
        //使用泛型给HashMap添加3个学生对象
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("tom",new Student("tom",34));
        stringStudentHashMap.put("milan",new Student("milan",24));
        stringStudentHashMap.put("hsp",new Student("hsp",14));
        //迭代器遍历
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}