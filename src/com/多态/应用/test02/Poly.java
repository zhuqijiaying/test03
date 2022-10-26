package com.多态.应用.test02;

public class Poly {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan", 5000,21313);
        Poly poly = new Poly();
        poly.showEmpAnnual(tom);
        poly.showEmpAnnual(milan);
        poly.test(milan);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void test(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }

    }
}
