package comThree.内部类.成员内部类;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.t1();
        //外部其他类访问成员内部类
        //第一种：相当于把new Inner()当做是outer的成员
        Outer.Inner inner = outer.new Inner();
        inner.say();
        //第二种，在外部类中写一个方法，可以返回Inner对象
        Outer.Inner innerInstance = outer.getInnerInstance();
        innerInstance.say();
        //第三种，


    }
}
class Outer{//外部类
    private int n1 = 100;
    private String name = "张三";

    private void hi(){
        System.out.println("hi方法");
    }
    //1.成员内部类，是定义在外部类的成员位置上。区别于局部内部类，只能调用在方法或代码块中
    //2.可以添加任何修饰符(public、protected、默认、private)，地位就相当于成员
    public class Inner{//成员内部类
        private double sal = 88;
        private int n1 = 200;
        public void say(){

            //可以直接访问外部类的所有成员，包含私有的
            //如果外部类和局部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，使用 外部类名.this.成员 去访问
            System.out.println("Outer的n1="+n1+" 外部类的n1="+Outer.this.n1+" Outer的name="+name);
            hi();//私有方法可以调用
        }

    }

    public Inner getInnerInstance(){
        return new Inner();
    }


    public void t1(){
        //外部类使用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner inner = new Inner();
        inner.say();
        System.out.println(inner.sal);
    }
}