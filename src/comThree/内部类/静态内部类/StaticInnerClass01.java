package comThree.内部类.静态内部类;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        //外部其他类使用静态内部类
        //方式1
        //静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer.Inner inner = new Outer.Inner();
        inner.say();
        //方式2
        //编写一个方法，可以返回静态内部类的对象实例
        Outer.Inner inner1 = new Outer.Inner();
        inner1.say();
        //方式3
        Outer.Inner inner_ = Outer.getInner_();
        inner_.say();
    }
}
class Outer{
    private int n1 = 100;
    private static String name = "张三";
    private static void cry(){

    }
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    //4.可以添加任意访问修饰符(public、protected、默认、private)，因为它的地位就是一个成员
    //5.作用域:同其他的成员，为整个个体
    static class Inner{
        private static String name = "韩顺平教育";
        public void say(){
            //访问非静态属性会报错
            //如果外部类和局部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，使用 外部类名.成员 去访问
            System.out.println(name+"  外部类成员名字="+Outer.name);
        }
    }
    public void show(){
        Inner inner = new Inner();
        inner.say();
    }
    public Inner getInner(){
        return new Inner();
    }
    public static Inner getInner_(){
        return new Inner();
    }
}