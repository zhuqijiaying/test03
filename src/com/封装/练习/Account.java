package com.封装.练习;

public class Account {
    private String name;
    private double money;
    private String passward;

    public Account() {
    }

    public Account(String name, double money, String passward) {
        this.setName(name);
        this.setMoney(money);
        this.setPassward(passward);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=4){
            this.name = name;
        }else{
            System.out.println("输入错误,长度为2-4，默认为无名");
            this.name="无名";
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money>20){
            this.money = money;
        }else{
            System.out.println("默认为0");
            this.money=0;
        }

    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        if (passward.length()==6){
            this.passward = passward;
        }else{
            System.out.println("错误");
            this.passward="000000";
        }

    }
    public void info(){
        System.out.println("信息为 name="+name+" money="+money+" 密码="+passward);
    }
}
