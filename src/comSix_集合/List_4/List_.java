package comSix_集合.List_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zq
 */
public class List_ {
    public static void main(String[] args) {
        //1.List集合类中元素有序(即添加顺序和取顺序一致)、可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        System.out.println("list="+list);
        //2.List集合中的每个元素都有对应的顺序索引，即支持索引
        System.out.println(list.get(3));//索引从0开始
        //3.
    }
}
