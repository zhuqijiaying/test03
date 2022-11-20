package comSix_集合.Map接口实现类HashTable8;

import java.util.Properties;

/**
 * @author zq
 */
public class Properties_ {
    public static void main(String[] args) {
        //HashTable子类，key和value不能为null
        Properties properties = new Properties();
        properties.put("john",100);//k-v键值对
        properties.put("jack",100);
        properties.put("jack",200);//替换
        System.out.println(properties);
        //删除
        properties.remove("john");
        System.out.println(properties);
        //修改
        properties.put("jack",300);
        System.out.println(properties);
        //查找
        properties.get("jack");
        System.out.println(properties);
        properties.getProperty("jack");
        System.out.println(properties);
    }
}
