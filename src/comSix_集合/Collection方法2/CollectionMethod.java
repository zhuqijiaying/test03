package comSix_集合.Collection方法2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq
 */
public class CollectionMethod {
    public static void main(String[] args) {
        //List中的是对象
        List list = new ArrayList();
        list.add("jack");
        list.add(18);
        list.add(18);
        list.add(true);
        System.out.println("List="+list);

        list.remove(0);//删除第一个元素
        list.remove((Integer)18);//指定删除
        list.remove(true);//指定删除
        System.out.println("List="+list);

        System.out.println(list.contains("jack"));//查找是否有"jack"
        System.out.println(list.size());//获取元素个数
        System.out.println(list.isEmpty());//判断是否为空
        //list.clear();//清空
        //添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.containsAll(list2));//查找多个元素是否都在
        //删除多个元素
        list.add("聊斋");
        list.removeAll(list2);//删除list中所有的list2元素
        System.out.println(list);
    }
}
