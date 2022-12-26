package comTen_reflection.classload_;

/**
 * @author
 * 类加载的五个阶段
 * 加载Loading
 * 链接Linking:验证(verification)、准备(Preparation)、解析(Resolution)
 * 初始化(initialization)
 */
public class ClassLoad02 {
    public static void main(String[] args) {
        //准备阶段

    }
}
class A{
    //属性-成员变量-字段
    //该阶段属性是如何处理的
    //1.n1是实例属性，不是静态变量，因此在准备阶段，是不会分配内存
    //2.n2是静态变量，分配内存n2是默认初始化0，而不是20
    //3.n3是static final 是常量，它和常量，它和静态变量不一样一旦赋值就不变n3=30
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;

}