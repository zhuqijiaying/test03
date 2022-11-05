package comThree.抽象类abstract;

public class AbstractDetail02 {
}
//抽象类的本质还是类，可以有类的各种成员
abstract class D{
    public int a = 1;
    public static String name = "hsp";
    public D(int a) {
        this.a = a;
    }
    public void hi(){
        System.out.println("hi");
    }
    {
        System.out.println("hihi");
    }
    public abstract void hello();

}
//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
abstract class E{
    public abstract void hi();
}
class F extends E{
    @Override
    public void hi() {

    }
}
//or
abstract class G extends E{

}

//抽象方法不能使用private、final、和static来修饰，因为这些关键字都是和重写相违背的
//abstract class H{
//    private abstract void hi(){
//
//    };
//}
