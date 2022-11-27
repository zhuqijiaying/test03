package comSeven_泛型.自定义泛型接口;

/**
 * @author zq
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
/**
        1.接口中，静态成员也不能使用泛型
        2.泛型接口的类型·，在继承接口或者实现接口时确定
        3.没有指定时，默认为Object
 **/

interface IUsb<U,R>{
    //普通方法中，可以使用接口泛型
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    //默认(default)方法，也是可以使用泛型
    default R method(U u){
        return null;
    }
}
//在继承接口时，指定泛型接口的类型
interface IA extends IUsb<String,Double>{}
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
//实现接口时,指定泛型接口的类型
//当我们在实现IUsb方法时,会使用Integer替换U，使用Float替换R
class BB implements IUsb<Integer,Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
//没有指定时，默认为Object
class CC implements IUsb{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}