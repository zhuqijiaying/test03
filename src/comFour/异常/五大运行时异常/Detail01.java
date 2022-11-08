package comFour.异常.五大运行时异常;
//空指针异常(NullPointerException)
public class Detail01 {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
