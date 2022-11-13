package comFive_常用类.StringBuffer类;

public class StringExercise01 {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        String c= new String ("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a==a.intern());
        System.out.println(a==c.intern());
        System.out.println(c==c.intern());
        System.out.println("========================================");
        Person person1 = new Person();
        person1.name="hspedu";
        Person person2 = new Person();
        person2.name="hspedu";
        System.out.println(person1.name.equals(person2.name));
        System.out.println(person1.name==person2.name);
        System.out.println(person1.name=="hspedu");
        System.out.println("=============================");
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
    }
}
class Person{
    public String name;
}