package comSix_集合.Map接口实现类HashTable8;

import java.util.Hashtable;

/**
 * @author zq
 */
@SuppressWarnings("all")
public class HashTable_ {
    public static void main(String[] args) {
        /*
        HashTable的基本介绍
        (1) 存放的元素是键值对：即 K-V
        (2) hashtable的键和值都不能为null，否则会抛出NullPointerException
        (3)hashTable使用方法基本上和HashMap一样
        (4) hashTable 是线程安全的，hashMap是线程不安全的
         */
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
        //会有空指针异常
//        hashtable.put("john",null);
//        hashtable.put(null,100);
//        hashtable.put(null,null);
        hashtable.put("jack",200);
        hashtable.put("jack",300);//替换
        System.out.println(hashtable);
    }
}
