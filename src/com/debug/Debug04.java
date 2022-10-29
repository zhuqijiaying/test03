package com.debug;

import java.util.Arrays;

//演示执行到下一断点
public class Debug04 {
    public static void main(String[] args) {
        int arr[] = {8,7,65,7,57,45,-12};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
    }
}
