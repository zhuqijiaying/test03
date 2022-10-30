package com.homework.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Manger manger = new Manger("jack",130,34,1.2);
        manger.setBonus(1000);
        manger.dy();

        Workers workers = new Workers("mack",100,30,1.0);
        workers.dy();
    }
}
