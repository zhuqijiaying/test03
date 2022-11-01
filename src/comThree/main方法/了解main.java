package comThree.main方法;

public class 了解main {
    public static void hi(){}
    public void hello(){}
    private static String name = "韩顺平教育";
    private String name1 = "韩顺平教育";
    public static void main(String[] args) {
        System.out.println(name);
        hi();

        //错误调用 hello();
        //System.out.println(name1);
        //要访问，先创建对象，再调用
        了解main main01 = new 了解main();
        System.out.println(main01.name1);
        main01.hello();
    }
}
