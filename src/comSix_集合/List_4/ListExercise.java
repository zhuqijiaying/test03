package comSix_集合.List_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zq
 */
public class ListExercise {
    public static void main(String[] args) {
        //添加10个以上元素
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println(list);
        //在2号位加入
        list.add(1,"韩顺平教育");
        System.out.println(list);
        //获取5号位
        list.get(4);
        System.out.println(list.get(4));
        //删除6号位
        list.remove(5);
        System.out.println(list);
        //修改7号位元素
        list.set(6,"三国演义");
        System.out.println(list);
        //迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
