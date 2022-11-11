package comFive_常用类.arrays_;

import java.util.Scanner;

/**
 * @author zq
 */
public class hh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个四位数");
        int i1 = scanner.nextInt();
//        if(i1<=9999&&i1>=1000){
//            int ge = i1%10;
//            int shi = i1/10%10;
//            int bai = i1/100%10;
//            int qian = i1/1000;
//            if(ge*ge*ge*ge+shi*shi*shi*shi+bai*bai*bai*bai+qian*qian*qian*qian==i1){
//                System.out.println("该数是");
//            }else{
//                System.out.println("该数不是");
//            }
//        }else{
//            System.out.println("输入错误");
//        }
        String s = Integer.toString(i1);
        if(i1<=9999&&i1>=1000){
            if((Math.pow(s.charAt(0),4)+Math.pow(s.charAt(1),4)+Math.pow(s.charAt(2),4)+Math.pow(s.charAt(3),4))==i1){
                    System.out.println("该数是");
                }else{
                    System.out.println("该数不是");
                }
            }else{
                System.out.println("输入错误");
            }
    }
}
