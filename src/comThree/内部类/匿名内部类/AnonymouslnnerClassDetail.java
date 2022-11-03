package comThree.内部类.匿名内部类;

public class AnonymouslnnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    //创建一个基于类的匿名内部类
    //作用域:仅仅定义在它的方法和代码块中
    private int n1 = 99;
    public void f1(){
        Person person = new Person(){
            private int n1 = 91;
            @Override
            public void hi() {
                //可以访问外部类的所有成员，包含私有的
                //如果外部类和匿名内部类重名时，匿名内部类访问的话，遵守就近原则,如果想访问匿名外部类的成员，使用 (外部类名.this.成员) 去访问
                System.out.println("匿名内部类重写hi方法"+n1+"访问匿名外部类成员="+Outer05.this.n1);
            }
        };
        person.hi();//动态绑定，运行类型是Outer05$1

        //也可以直接调用
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法，哈哈哈");
            }
        }.hi();
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
}