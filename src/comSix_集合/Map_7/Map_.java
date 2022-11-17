package comSix_集合.Map_7;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zq
 */
public class Map_ {
    public static void main(String[] args) {
        //1.Map与Collection并列存在。用于保存具有映射关系的数据：key-Value(双列元素)
        //2.Map中的key和Value可以是任何引用类型的数据，会封装到HashMap$Node对象中
        //3.Map中的key不允许重复，原因和HashSet一样
        //4.Value可以重复
        //5.map的key可以为null，value也可以为null，注意key为null，只能有一个，value为null，可以有多个
        //6.常用String类作为key
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","张无忌");
        map.put("no1","张三丰");//有相同的key，等价于替换
        map.put("no3","张三丰");//Value可以重复
        map.put(null,null);
        map.put(null,"张三丰");
        map.put("no5",null);
        System.out.println(map);
        System.out.println(map.get("no1"));
        System.out.println(map.get(null));
    }
}
