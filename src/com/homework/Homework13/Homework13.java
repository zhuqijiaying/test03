package com.homework.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("jack", 23, '男', "2103203");
        student.printInfo();
        Teacher teacher = new Teacher("mack", 34, '女', "21310932");
        teacher.printInfo();
        Person[] persons = new Person[4];
        persons[0] = new Student("jack",23,'男',"213231");
        persons[1] = new Student("lack",24,'女',"213232");
        persons[2] = new Teacher("back",32,'男',"121312");
        persons[3] = new Teacher("mack",33,'女',"121313");

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        for(int i=0;i<persons.length;i++){
            System.out.println(persons[i]);
        }

        for (int i = 0; i <persons.length ; i++) {
            homework13.test(persons[i]);
        }


    }
    public void test(Person p){
        if(p instanceof Student){
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else{
            System.out.println("do nothing...");
        }
    }
    public void bubbleSort(Person[] persons){
        Person temp=null;
        for (int i=0;i<persons.length-1;i++){
            for (int j=0;j<persons.length-1-i;j++){
                if (persons[j].getAge()<persons[j+1].getAge()){
                    temp =  persons[j];
                    persons[j]=persons[j+1];
                    persons[j+1]=temp;
                }

            }
        }
    }
}
