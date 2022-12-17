package comNine_IO流.对象处理流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author zq
 */
//读写顺序要一致
//要求序列化或反序列化对象，需要实现serializable
//序列化对象时，默认将里面所有属性都进行序列化，但除了static或transient修饰的成员
//序列化对象时，要求里面属性得类型也需要实现序列化接口
//序列化具备可继承性，也就是如果某类已经实现了序列化，则它的所有子类也已经默认实现序列化

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "D:\\data.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
