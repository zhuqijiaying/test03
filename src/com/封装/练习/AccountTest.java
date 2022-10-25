package com.封装.练习;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("muck");
        account.setMoney(1213);
        account.setPassward("123456");
        account.info();
    }
}
