package comFour.异常.五大运行时异常;
//类型转换异常(ClassCastException)
public class Detail04 {
    public static void main(String[] args) {
        A a = new B();

        B b = (B)a;
        C c = (C)a;
    }
}
class A{}
class B extends A{}
class C extends A{}