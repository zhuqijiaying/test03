package comTen_reflection.classload_;

/**
 * @author zq
 */
public class ClassLoad03 {
    public static void main(String[] args) {
        //1.加载B类，生成B的class对象
        //2.链接num=0
        //3.初始化阶段
        //  依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句
//        clinit(){
//            System.out.println("B静态代码块被执行");
//            num=300;
//            num = 100
//        }
//        合并：num=100
        System.out.println(B.num);//直接使用类的静态属性，也会导致类的加载

    }
}
class B{
    static {
        System.out.println("B静态代码块被执行");
        num=300;
    }
    static int num = 100;
    public B(){
        System.out.println("B的构造器被执行");
    }
}