package comSix_集合.Map_7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zq
 */
//添加3个员工，遍历工资大于28000的
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Employee(1,"张三",12000));
        map.put(2,new Employee(2,"李四",113000));
        map.put(3,new Employee(3,"王五",114000));
        System.out.println(map);
        Set set = map.keySet();
        System.out.println("=======第一种======");
        for (Object o :set) {
            //先获取Value:map.get(key)
            Employee employee = (Employee)map.get(o);
            if(employee.getPrice()>18000){
                System.out.println(employee);
            }

        }
        System.out.println("=======第二种=======");
        Set entrySet= map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Employee employee = (Employee)entry.getValue();
            if(employee.getPrice()>18000){
                System.out.println(employee);
            }
        }
    }

    }

class Employee{
    private int id;
    private String name;
    private double price;

    public Employee(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}