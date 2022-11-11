package comFive_常用类.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zq
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int arr[]={4,2,5,1,-6,2,7};
        bubble01(arr);
        System.out.println("=====排序后的情况=====");
        System.out.println(Arrays.toString(arr));
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i2-i1;
            }
        });
        System.out.println("=====定制排序后的结果=====");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble01(int arr[]){
        int tamp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {

                if(arr[j]>arr[j+1]){
                    tamp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tamp;
                }
            }
        }
    }
    //冒泡+定制排序
    public static void bubble02(int arr[], Comparator c){
        int tamp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                //数组排序由c.compare(arr[j],arr[arr[j+1])返回的值决定
                if(c.compare(arr[j],arr[j+1])>0){
                    tamp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tamp;
                }
            }
        }
    }
}
