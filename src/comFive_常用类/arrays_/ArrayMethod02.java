package comFive_常用类.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author zq
 */
public class ArrayMethod02 {
    public static void main(String[] args) {
        //binarySearch通过二分搜索法进行查找，要求必须排好序
        int arr[]={12,35,2,43,-1,6,12,67,3};
        int tamp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tamp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tamp;
                }
            }
        }
        int index = Arrays.binarySearch(arr,35);
        System.out.println(index);
        //copyOf数组元素的复制
        int newArr[] = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));
        //file数组的填充:所有的数全替换为填充的数
        int num[] = {9,23,4};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));
        //equals比较两个数元素内容是否完全一致
        boolean equals = Arrays.equals(arr,newArr);
        System.out.println(equals);
        //aslist,将一组值转为list
        List asList = Arrays.asList(1,352,3532,423,43);
        System.out.println(asList);
    }
}
