package comThree.代码块;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        System.out.println("AAA()构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }
    public BBB(){
        System.out.println("BBB()构造器被调用");
    }
}