package comSix_集合.Map_7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author zq
 */
@SuppressWarnings("all")
public class TreeMap_ {
    public static void main(String[] args) {
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
                //return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","史密斯");
        treeMap.put("july","朱莉");
        System.out.println(treeMap);
    }
}
