package comSix_集合.Set_6;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author zq
 */
public class LinkedHashSetScource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘",1213));
        set.add(123);
        set.add("hsp");
        System.out.println(set);
        //1.LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        //2.LinkedHashSet 底层维护的是一个LinkedHashMap(是HashMap的子类)
        //3.LinkedHashSet底层结构(数组+双向链表)
        //4.添加第一次时，直接将数组table扩容到16，存放的节点类型是LinkedHashSet$Entry
    }
}
class Customer{
    private String name;
    private int num;
    public Customer(String name,int num){
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}