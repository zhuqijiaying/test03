package comSix_集合.Set_6;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zq
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //1.使用无参构造器，创建TreeSet时，仍然是无序的
        //TreeSet treeSet = new TreeSet();
        //2.按照字符串大小排序
        //3.使用TreeSet提供的一个构造器，可以传入一个比较器（匿名内部类）
        // 并指定排序规则

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 按照字母排序
                return ((String)o1).compareTo((String)o2);
                //按照长度大小排
                //return ((String)o1).length()-((String)o2).length();//比较结果相等的，不会加入
            }
        });
        treeSet.add("jack");
        treeSet.add("muck");
        treeSet.add("sj");
        treeSet.add("s");
        treeSet.add("hsp");
        System.out.println(treeSet);
    }
}
