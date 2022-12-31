package comTen_reflection.class_;

/**
 * @author zq
 * 对Class类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class也是类，因此也继承Object类
        //2.Class类对象不是new出来的，而是系统创建的
        //（1）传统new对象
        //Cat cat = new Cat();
        //(2) 反射方式
        //  通过ClassLoader类加载Class对象
        Class aClass1 = Class.forName("comTen_reflection.reflectionQuestion1.Cat");
        //3.对于某个类的Class类对象，在内存中只有一份，因此类只加载一次
        //hashCode()相同，类只加载一次
        Class aClass2 = Class.forName("comTen_reflection.reflectionQuestion1.Cat");
        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());

        //4.每个类的实例都会记得自己是由哪个Class 实例所生成
        //5.通过Class对象可以完整地得到一一个类的完整结构，通过一系列API
        //6. Class对象是存放在堆的
        // 7.类的字节码二进制数据，是放在方法区的，有的地方称为类的元数据(包括方法代码 变量名， 方法名，访问权限等等)
    }
}
