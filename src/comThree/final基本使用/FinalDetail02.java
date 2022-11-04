package comThree.final基本使用;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

    }
}
final class AAA{
    //类是final，里面方法没必要用final修饰
    public final void cry(){

    }
}
class BBB{
    //final 和 static 搭配使用，不会导致类的加载
    public final static int num = 1000;
    static {
        System.out.println("BBB代码块被执行");
    }
}