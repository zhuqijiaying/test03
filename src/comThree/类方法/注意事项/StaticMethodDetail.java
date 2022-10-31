package comThree.类方法.注意事项;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        //非静态方法不能通过类名调用
        //D.say();c错误
        new D().say();//可以
    }
}
class D{
    private int n1 = 100;
    private static int n2 = 200;
    public void say(){//非静态方法
        System.out.println(this.n1);
    }
    public static void hi(){//静态方法
        //System.out.println(this.n1);错误，不能使用this，super
    }
    public static void hello(){
        System.out.println(n2);
        System.out.println(D.n2);
        //静态方法只能访问静态变量或静态方法
        hi();//可以调用
        //say();不能调用
    }
    public void ok(){
        //普通成员方法，既可以访问普通变量(方法)，又可以访问静态变量(方法)
        hi();
        say();
        System.out.println(n1);
        System.out.println(n2);
    }
}
