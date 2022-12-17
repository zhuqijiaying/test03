package comNine_IO流.对象处理流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author zq
 */
//演示ObjectOutStream的使用，完成数据的序列化
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "\\data.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.3);
        objectOutputStream.writeUTF("韩顺平教育");
        objectOutputStream.writeObject(new Dog("旺财",19));
        objectOutputStream.close();
        System.out.println("数据保存完毕");
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}