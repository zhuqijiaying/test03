package comSix_集合.集合框架体系1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zq
 */
public class Collection_ {
    public static void main(String[] args) {
        //1.集合主要是两组(单列集合和双列集合)
        //2.Collection接口有两个重要的子接口List Set，他们的实现子类都是单列集合
        //3.Map接口的实现子类是双列集合，存放的K-V数据
        //单列
        ArrayList arrayList =new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        //双列
        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","北京");
    }
}
