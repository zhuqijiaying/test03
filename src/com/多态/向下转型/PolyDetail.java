package com.多态.向下转型;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型的引用名 = new 子类类型();
        Animal animal = new Cat();
        //可以调用父类的所有成员
        //但是不能调用子类的特有的成员：例如子类cat中的catchMouse
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类(运行类型）开始查找方法，然后调用
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        Cat cat1 = new Cat();
        cat1.catchMouse();


        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
