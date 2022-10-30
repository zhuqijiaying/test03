package com.homework.Homework08;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        System.out.println(checkingAccount.getBalance());
    }
}
