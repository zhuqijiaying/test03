package comThree.代码块;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        B b = new B();
    }
}
class B{


    private static int n1 = getN1();//和代码块优先级一样，谁在前面就先调用谁
    static {
        System.out.println("A静态代码块");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }



    private int n2 = getN2();//普通属性初始化
    {
        System.out.println("A的普通代码块");
    }
    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    public B(){//优先级低于前面两个
        System.out.println("普通构造器被调用");
    }
}