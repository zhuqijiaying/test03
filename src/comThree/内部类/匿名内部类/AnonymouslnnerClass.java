package comThree.内部类.匿名内部类;

public class AnonymouslnnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}
class Outer{//外部类
    private int n1 = 10;
    public void method(){
        //                                基于接口的匿名内部类
        //1.需求：想使用IA接口，并创建对象
        //2.
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型是：IA
        //6.tiger的运行类型 就是匿名内部类
        /*
        底层代码:会分配类名Outer$1
        class Outer$1 implements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }


         */

        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        System.out.println("tiger的运行类型"+tiger.getClass());
        tiger.cry();


        //基于类的匿名内部类
        //1.father编译类型：Father
        //2.father运行类型：Outer$2
        //3.底层会创建匿名内部类
        /*
           class Outer$2 extends Father{

           }
         */
        //4.同时也直接返回了匿名内部类Outer$2的对象
        //5.注意("jack")参数列表会传递给构造器
        Father father = new Father("jack"){//加了大括号，变成了匿名内部类

            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println("father对象的运行类型="+father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}
interface IA{
    void cry();
}
class Father{
    public Father(String name){
        System.out.println("接收到name="+name);
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}