package com.多态.应用.test01;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0]=new Person("gad",20);
        persons[1]=new Student01("jack",20,100);
        persons[2]=new Student01("muck",20,123);
        persons[3]=new Teacher01("smith",20,2222);
        persons[4]=new Teacher01("tom",20,31030);

        //循环遍历多态数组，调用say方法
        for (int i = 0;i < persons.length;i++){

            System.out.println(persons[i].say());
            if(persons[i] instanceof Student01){
                Student01 student01 = (Student01)persons[i];
                student01.study();
            }else if(persons[i] instanceof Teacher01){
                Teacher01 teacher01 = (Teacher01)persons[i];
                teacher01.teach();
            }else if(persons[i] instanceof Person){

            } else{
                System.out.println("类型有误");
            }

        }
        //不能直接调用
//        persons[i].teach();
//        persons[i].study();
    }
}
