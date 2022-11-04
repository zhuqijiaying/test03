package comThree.final基本使用;

public class Final01 {
    public static void main(String[] args) {
//        E e = new E();
//        e.TAX_RATE = 0.09;


//        F f = new F();
//        f.cry();
    }
}
//如果我们要求A类不能被其他类继承
//可以使用final
final class A{}
//class B extends A{}


//当不希望子类方法被重写
class C{
    //如果我们要求hi不能被子类重写
    //可以使用final修饰hi方法
    public final void hi(){

    }
}
class D extends C{

//    @Override
//    public void hi() {
//        System.out.println("重写C类hi方法");
//    }
}

//当不希望类的某个属性的值被修改，可以使用final修饰
class E{
    public final double TAX_RATE=0.08;
}

//当不希望某个局部变量被修改，可以使用final修饰
class F{
    public void cry(){
        final double MUN = 0.01;
//        MUN =0.9;
        System.out.println(MUN);
    }
}