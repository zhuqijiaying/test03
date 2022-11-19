package comSix_集合.Set_6;

import java.util.HashSet;

/**
 * @author zq
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("rose"));//T
        set.remove("john");
        System.out.println(set);


        set = new HashSet();
        set.add("jack");
        set.add("jack");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println(set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}