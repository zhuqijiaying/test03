package comSix_集合.Map_7;

import java.util.*;

/**
 * @author zq
 */
@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args)  {
        Map map = new HashMap();
        map.put("邓超",new Book1("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组：先取出所有的key，再通过key取出对应的Value
        Set keyset = map.keySet();
        System.out.println("=========第一种========");
        //(1)增强for
        for (Object key :keyset) {
            System.out.println("-"+map.get(key));
        }
        //(2)迭代器
        System.out.println("=========第二种========");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next+"-"+map.get(next));
        }

        //第二组：把所有的Values取出(不能反向取key)
        Collection values = map.values();
        //（1）增强for
        System.out.println("=========取出所有的value 增强for========");
        for (Object value :values) {
            System.out.println(value);
        }
        //（2）迭代器
        System.out.println("=========取出所有的value 迭代器========");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        //第三组：通过EntrySet来获取K-V
        Set entrySet = map.entrySet();
        //（1）增强for
        System.out.println("=========第三种=========");
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        //（2）迭代器
        System.out.println("==========第四种========");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry m = (Map.Entry)next;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
class Book1{
    private String name;
    private int price;

    public Book1(String name,int price) {
        this.name = name;
        this.price = price;
    }
}