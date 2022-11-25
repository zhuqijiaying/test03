package comSeven_泛型.自定义泛型;

/**
 * @author zq
 */
public class CustomGeneric_ {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> john = new Tiger<>("john");
        john.setT(10.9);
        //john.setT("yy");//错误，类型不对
        System.out.println(john);
        Tiger tiger = new Tiger("john~~~");
        tiger.setT("yy");
        System.out.println(tiger);
    }
}
//1.Tiger后面泛型，所以我们把Tiger就称为自定义泛型类
//2.标识符可以有多个
//3.普通成员可以使用泛型(属性，方法)
//4.使用泛型的数组不能初始化
//5.静态方法不能使用泛型
class Tiger<T,R,M>{
    String name;
    R r;//属性使用泛型
    T t;
    M m;
    //因为数组在new 不能确定T的类型，就无法在内存开空间
    //T ts[]=new T[1];
    public  Tiger(String name){
        this.name = name;
    }

    public Tiger( R r, T t, M m) {//构造器使用泛型
        this.r = r;
        this.t = t;
        this.m = m;
    }
    //因为静态是和类相关的，在类加载时，对象还没有创建
//    public static void m1(M m){
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {//方法使用泛型
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", t=" + t +
                ", m=" + m +
                '}';
    }
}