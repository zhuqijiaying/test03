package comFour.tryCatch;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = 0;
        while (true){
            System.out.println("请输入一个整数：");
            String input =scanner.next();
            try {
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误，重新输入");
            }
        }
        System.out.println("你输入的值为："+num);
    }
}
