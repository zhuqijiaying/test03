package comFour.注解;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
    }
}
//表示该类或属性过时，不推荐使用，但可以使用
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
}