package comThree.抽象类abstract;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能实例化
        //A a = new A();

    }
}
//抽象类可以没有抽象方法，可以有实现方法
abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}
//当一个类存在抽象方法时，需要将该类声明为abstract类
//class B{
//    public abstract void hi(){
//        System.out.println("hi");
//    }
//}

//abstract只能修饰类和方法，不能修饰属性和其他的
//class C{
//    public abstract int a=1;
//}