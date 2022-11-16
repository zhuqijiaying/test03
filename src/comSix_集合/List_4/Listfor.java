package comSix_集合.List_4;

import java.util.*;

/**
 * @author zq
 */
public class Listfor {
    public static void main(String[] args) {
        //list实现接口的子类，遍历方法都一样
        //List list = new LinkedList();
        List list = new ArrayList();
        //List list = new Vector();
        for (int i =0 ;i<4;i++){
            list.add("hello"+i);
        }
        System.out.println(list);
        //遍历
        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //增强for
        for (Object o :list) {
            System.out.println(o);
        }

        //for循环（当做数组循环遍历）
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
