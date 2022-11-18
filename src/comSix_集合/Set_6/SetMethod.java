package comSix_集合.Set_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zq
 */
public class SetMethod {
    public static void main(String[] args) {
        //1.以set接口的实现类HashSet来讲解Set接口的方法
        //2.set接口的实现类的对象(Set接口对象)，不能存放重复的元素，可以添加null
        //3.set接口对象存放数据是无序的(即添加的顺序和取出的顺序不一致)
        //4.取出的顺序虽然不是添加的顺序，但是是固定的
        Set set = new HashSet();
        set.add("jack");
        set.add("john");
        set.add("hsp");
        set.add("lucy");
        set.add("john");
        set.add(null);
        set.add(null);
        System.out.println(set);

        //遍历
        //1.迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=====================");
        //2.增强for
        for (Object o :set) {
            System.out.println(o);
        }

        for (int i = 0; i <set.size() ; i++) {

        }

    }
}
