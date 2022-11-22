package comSix_集合.Homework11;

import java.util.*;

/**
 * @author zq
 */
/*
(1)使用HashMap类实例化一个Map类型的对象m，键(String)和值(int)分别用于存储员工的姓名和工资，存入数据如下：
jack—650元；tom—1200元；smith—2900元；
(2)将iack的工资更改为2600元
(3)为所有员工工资加薪100元；
(4)遍历集合中所有的员工
(5)遍历集合中所有的工资

 */
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);

        m.put("jack",2600);

        Set keySet = m.keySet();
        for (Object o :keySet) {
            m.put(o,(Integer)m.get(o)+100);
        }
        System.out.println(m);

//        Set entrySet = m.entrySet();
//        Iterator iterator = entrySet.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry =  (Map.Entry) iterator.next();
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }
        Set keySet1 = m.keySet();
        Iterator iterator = keySet1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        Collection values = m.values();
        for (Object o :values) {
            System.out.println(o);
        }

    }
}
