package comThree.内部类.局部内部类;

import org.w3c.dom.ls.LSOutput;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}
class Outer{//外部类
    private int n1 =190;
    private void m2(){
        System.out.println("被输出了");
    }
    public void m1(){
        //1.局部内部类是定义在外部类的局部位置，通常在方法中
        //2.可以访问外部类的所有成员，包含私有的
        //3.不能添加访问修饰符，但是可以使用final修饰
        //4.作用域：仅仅在定义它的方法或代码块中
        class Inner{
            private int n1 =400;
            public void f1(){
                //5.局部内部类可以直接访问外部类的成员
                //7.如果外部类和局部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，使用 外部类名.this.成员 去访问
                System.out.println("n1="+n1+"外部类的n1="+Outer.this.n1);
                m2();
            }
        }
        //6.外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner inner = new Inner();
        inner.f1();
    }
}