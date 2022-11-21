package comSix_集合.Collections工具类10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zq
 */
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("king");
        list.add("muck");
        list.add("july");
        //1.反转list中的元素
        Collections.reverse(list);
        System.out.println("1:"+list);
        //2.随机排序
        Collections.shuffle(list);
        System.out.println("2:"+list);
        //3.按照元素自然排序
        //Collections.sort(list);
        //4.希望按照字符串的长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("4:"+list);
        //5.指定位置交换
        Collections.swap(list,0,1);
        System.out.println("5:"+list);
        //6.自然顺序最大元素
        System.out.println("6:"+Collections.max(list));
        //7.比如，返回长度最大的元素
        Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("7:"+list);
        //8.查看元素出现次数
        System.out.println("8:"+Collections.frequency(list,"jack"));
        //9.拷贝
        List list1 = new ArrayList();
        for (int i = 0; i <list.size() ; i++) {
            list1.add(" ");
        }
        Collections.copy(list1,list);
        System.out.println("9:"+list1);
        //10.使用新值替换旧值
        Collections.replaceAll(list,"jack","杰克");
        System.out.println("10:"+list);
    }
}
