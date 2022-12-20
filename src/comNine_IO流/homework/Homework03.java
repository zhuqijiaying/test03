package comNine_IO流.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author zq
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.setProperty("name","tom");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//        properties.store(new FileOutputStream("src\\dog.properties"),null);
//        System.out.println("保存配置文件成功");
        String filePath = "src\\dog.properties";
        properties.load(new FileReader(filePath));
        //properties.list(System.out);//查看小狗信息
        String name = properties.get("name")+"";
        int age =Integer.parseInt(properties.get("age")+"");
        String color = properties.get("color")+"";
        Dog dog = new Dog(name,age,color);
        System.out.println(dog);
    }
}
class Dog{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}