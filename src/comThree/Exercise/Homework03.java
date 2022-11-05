package comThree.Exercise;

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract  void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪叫");
    }
}