package comSix_集合.ArrayList注意事项5;

import java.util.ArrayList;

/**
 * @author zq
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //1.可以放任何值，包括null
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        //2.ArrayList是有数组来实现数据存储的
        //3.ArrayList基本等同于Vector，除了ArrayList是线程不安全（执行效率高），多线程不建议使用ArrayList


        //1.ArrayList中维护了一个Object类型的数组elementDate。·
        //2.当我们创建ArrayList的对象时，如果使用的是无参构造器，则初始elementDate容量为0，第一次添加，则扩容elementDate为10，
        //如需再次扩容，则扩容elementDate为1.5倍
        //3.如果使用的是指定大小的构造器，则初始elementDate容量为指定大小，如果需要扩容，则直接扩容elementDate的1.5倍
    }
}
