package comTen_reflection.class_;

import java.lang.reflect.Field;

/**
 * @author zq
 */
public class Class02 {
    public static void main(String[] args) throws Exception{
        String classAllPath = "comTen_reflection.class_.Car";
        Class cls = Class.forName(classAllPath);
        //输出cls
        System.out.println(cls);//显示cls对象，是哪个类的Class对象
        System.out.println(cls.getClass());//输出cls运行类型
        System.out.println(cls.getPackage().getName());//得到包名
        System.out.println(cls.getName());//得到全类名
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);
        //6.通过反射获取属性
        Field name1 = cls.getField("name");
        System.out.println(name1.get(car));//私有属性会报错
        //7.通过反射修改属性的值
        name1.set(car,"奔驰");//修改属性的值
        System.out.println(name1.get(car));
        //8.得到所有的属性
        Field[] fields = cls.getFields();
        for(Field f : fields ){
            System.out.println(f.getName()); 
        }
    }
}
