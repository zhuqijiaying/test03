package com.零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "------------------零钱通明细-----------------";
        //3.收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//用于日期格式化
        //4.消费
        String note = "";

        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退  出");
            System.out.println("请选择（1-4）:");
            key = scanner.next();


            //使用switch分支控制
            switch (key){
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    if(money<0){
                        System.out.println("收益需大于0");
                        break;
                    }
                    balance+=money;
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t"+balance;
                    System.out.println(details);
                    break;
                case "3" :
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();

                    if (money<=0||money>balance){
                        System.out.println("你消费超过了");
                        break;
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance-=money;
                    date = new Date();//获取当前日期
                    details += "\n+"+note+"\t-"+ money +"\t"+ sdf.format(date)+"\t"+balance;
                    System.out.println(details);
                    break;
                case "4" :
                    String choice = "";
                    while (true){
                        System.out.println("你确定要退出吗？");
                        choice = scanner.next();
                        if("y".equals(choice)||"n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
            }
        }while (loop);
        System.out.println("退出了零钱通项目~");
    }
}
