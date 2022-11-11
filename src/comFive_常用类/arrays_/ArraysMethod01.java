package comFive_常用类.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,23,4};
        //常规遍历数组
//        for (int i = 0; i <integers.length ; i++) {
//            System.out.println(integers[i]);
//        }
        //直接使用Arrays.toString方法显示数组信息
        System.out.println(Arrays.toString(integers));


        //数组排序
        //1.常规冒泡排序
        //2.直接使用Arrays提供的sort方法
        //3.sort重载的，也可以通过传入一个接口Comparator实现定制排序
        //4.调用定制排序时，传入两个参数（1）排序的数组
        //(2)
        Integer arr[]={1,23,43,1,2,34,1,34,3};
        //Arrays.sort(arr);//默认排序从小到大
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2-i1;//i1和i2替换，实现从小到大，从大到小的替换
            }
        });
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }
}
