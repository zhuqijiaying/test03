package comThree.抽象类abstract;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    //父类方法不确定性的问题
    //考虑设计成抽象方法
    //所谓抽象方法就是没有实现的方法
    //所谓没有实现是指，没有方法体
    //当一个类存在抽象方法时，需要将该类声明为abstract类
    public abstract void eat();
}
