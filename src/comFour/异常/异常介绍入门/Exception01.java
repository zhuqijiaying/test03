package comFour.异常.异常介绍入门;

public class Exception01 {
    public static void main(String[] args) {
        int n1 =100;
        int n2 = 0;
        //捕获异常，程序继续运行
        try {
            int res = n1/n2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续运行");
    }
}
