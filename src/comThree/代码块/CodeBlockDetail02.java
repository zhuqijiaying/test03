package comThree.代码块;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    private static int n1 = getN1();//和代码块优先级一样，谁在前面就先调用谁
    static {
        System.out.println("A静态代码块");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
}