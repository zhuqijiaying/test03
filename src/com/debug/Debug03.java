package com.debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr[] = {8,7,65,7,57,45,-12};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
