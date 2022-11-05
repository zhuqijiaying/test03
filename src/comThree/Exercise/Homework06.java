package comThree.Exercise;

import comTwo.houserent.domain.House;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
    }
}
interface Vehicles{

    public void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况坐马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("大河坐船");
    }
}
class Factory{
    //将方法做成static，方便调用
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof House)){
            vehicles = Factory.getHorse();

        }
        vehicles.work();
    }
}