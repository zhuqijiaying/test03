package com.继承.入门;

public class Test {
    public static void main(String[] args) {
        Dxs dxs = new Dxs();
        dxs.name="李明";
        dxs.age=20;
        dxs.setScore(100);
        dxs.testing();
        dxs.showinfo();


        Xxs xxs = new Xxs();
        xxs.name="小明";
        xxs.age=10;
        xxs.setScore(60);
        xxs.testing();
        xxs.showinfo();

    }
}
