package com.homework.Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(1234);
        worker.dy();
        Waiter waiter = new Waiter(1234);
        waiter.dy();
        Scientist scientist = new Scientist(1234);
        scientist.setRemuneration(20000);
        scientist.dy();
        Teacher teacher = new Teacher(1234);
        teacher.setBonus(2000);
        teacher.dy();
    }
}
