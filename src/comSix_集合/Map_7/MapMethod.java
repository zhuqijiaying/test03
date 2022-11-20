package comSix_集合.Map_7;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zq
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        System.out.println(map);
        //remove ,根据键删除映射关系
        map.remove(null);
        System.out.println(map);
        //get  根据键获取值
        System.out.println(map.get("鹿晗"));
        //size  获取元素个数
        System.out.println(map.size());
        //isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());
        //clear 清空
        //map.clear();
        //containsKey  查找key是否存在
        System.out.println(map.containsKey("王宝强"));
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}