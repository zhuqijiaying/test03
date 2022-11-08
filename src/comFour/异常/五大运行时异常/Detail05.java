package comFour.异常.五大运行时异常;
//数字格式异常(NumberFormatException)
public class Detail05 {
    public static void main(String[] args) {
        String name = "韩顺平";
        //将String转为int
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
