package comThree.类方法;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu jru = new Stu("jru");
        tom.payFee(200);

        Stu.showFee();
    }
}
class Stu{
    private String name;
    //定义一个静态变量，求累计学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    //1.当仿佛使用了static修饰后，该方法就是静态方法
    //2.静态方法就可以访问静态属性/变量

    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费有"+Stu.fee);
    }
}
