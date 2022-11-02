package comThree.接口.基本介绍;

public class Interface02 {
    public static void main(String[] args) {

    }
}
//1.如果一个类 implement实现接口
//2.需要将该接口的所有抽象方法都实现
class A implements Interface01{
    @Override
    public void hi() {
        System.out.println("hi...");
    }
}
//抽象类实现接口时，可以不实现接口的抽象方法
abstract class B implements Interface01{

}