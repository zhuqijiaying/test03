package comSeven_泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zq
 */
public class GenericDetail {
    public static void main(String[] args) {
        //1.给泛型指向数据类型是：要求是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<>();
        //ArrayList<int> ints = new ArrayList<int>();//错误

        //2.在给泛型指定具体类型后，可以传入该类型或者其子类型
        //因为E指定了A类型，构造器传入new A()
        Pig<A> aPig = new Pig<A>(new A());
        //指定A类型，不能传入new B(),但B继承A，成为A的子类型就可以传入了
        Pig<A> bPig = new Pig<A>(new B());
        //3.泛型的传统使用形式
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        List<Integer> integers2 = new ArrayList<Integer>();
        //在实际开发中是简写
        ArrayList<Integer> integers3 = new ArrayList<>();
        //4.如果这样写，泛型默认为Object
        ArrayList arrayList = new ArrayList();
    }
}
class A{}
class B extends A{}
class Pig<E>{
    E e;
    public Pig(E e) {
        this.e = e;
    }
}