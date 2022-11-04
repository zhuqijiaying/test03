package comThree.final基本使用;

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}
class AA{
    /*赋值
    1.定义时:public final double TAX_RATE = 0.08;
    2.在构造器中
    3.在代码块中
     */
    public final double TAX_RATE = 0.08;//定义时赋值
    public final double TAX_RATE2;//在构造器赋值
    public final double TAX_RATE3;//在代码块中赋值

    public AA() {
        TAX_RATE2 = 0.1;
    }
    {
        TAX_RATE3=0.1;
    }
}
class BB{
    public static final double i=12;
    public static final double i1;
//  final 修饰属性是静态的，不能在构造器中给值
//    public static final double i2;
//    public  BB{
//        i2=100;
//    }
    static {
        i1=9;
    }
}