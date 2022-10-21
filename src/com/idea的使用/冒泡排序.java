package com.idea的使用;

public class 冒泡排序 {

    public static void main(String[]args){
         
        int arr[]={1,2,34,3,43,5};
        MyTools px = new MyTools();
        px.px(arr);
        System.out.println("===========");
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
class MyTools{
    int temp=0;
    public void px(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
