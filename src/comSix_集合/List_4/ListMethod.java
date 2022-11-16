package comSix_集合.List_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add("tom");
        //1.插入：在索引为1的位置插入一个对象
        list.add(1,"韩顺平");
        System.out.println("1."+list);
        //2.插入：在索引为1的位置插入多个对象
        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jack");
        list.addAll(1,list2);
        System.out.println("2."+list);
        //3.返回对象在当前集合中首次出现的位置
        System.out.println("3."+list.indexOf("tom"));
        //4.返回对象在当前集合中首次出现的位置
        System.out.println("4."+list.lastIndexOf("tom"));
        //5.移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("5."+list);
        //6.设置指定index位置的元素为，相当于替换
        list.set(1,"玛丽");
        System.out.println("6."+list);
        //7.返回从fromIndex到toIndex位置的子集合
        List returnList = list.subList(0,3);
        System.out.println("7."+returnList);
    }
}
