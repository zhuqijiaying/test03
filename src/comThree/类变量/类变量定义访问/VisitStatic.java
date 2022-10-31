package comThree.类变量.类变量定义访问;

public class VisitStatic {
    public static void main(String[] args) {
        //说明：变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);

        //第二种方法
        A a = new A();
        System.out.println(a.name);
    }
}

class A {
    public static String name = "韩顺平教育";
}

class c {

}
