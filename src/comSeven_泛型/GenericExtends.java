package comSeven_泛型;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zq
 */
public class GenericExtends {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();
        //任意泛型类型都可以接收
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);
        //可以接收 AA或者AA子类
//        printCollection2(list1);//错误
//        printCollection2(list2);//错误
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);
        //支持AA类以及AA类的父亲，不限于直接父亲
        printCollection3(list1);
        //printCollection3(list2);//String和AA没关系
        printCollection3(list3);
        //printCollection3(list4);//AA子类，不满足条件
        //printCollection3(list5);//AA子类，不满足条件
    }
    //List<?>表示任意泛型类型都可以接收
    public static void printCollection1(List<?> c){
        for (Object object : c){
            System.out.println(object);
        }
    }
    //? extends AA表示上限，可以接收 AA或者AA子类
    public static void printCollection2(List<? extends AA> c){
        for (Object object : c){
            System.out.println(object);
        }
    }
    //? super 子类类名AA：支持AA类以及AA类的父亲，不限于直接父亲
    //规定泛型的下限
    public static void printCollection3(List<? super AA> c){
        for (Object object : c){
            System.out.println(object);
        }
    }
}
class AA{}
class BB extends AA{}
class CC extends BB{}