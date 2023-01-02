package comTen_reflection.reflection_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Properties;

/**
 * @author zq
 */
public class reflection01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\comTen_reflection\\properties_\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        //使用反射机制解决
        //（1）加载类，返回Class
        Class aClass = Class.forName(classfullpath);
        //（2）通过aClass得到加载的类comTen_reflection.reflectionQuestion1.Cat的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());
        //(3) 通过aClass得到你加载的类comTen_reflection.reflectionQuestion1.Cat的对象
        Method method1 = aClass.getMethod(method);
        //（4）通过Method1调用方法：即通过方法对象调用方法
        method1.invoke(o);

        //得到name字段
        //getFiled不能得到私有的属性
        //Field name = aClass.getField("name");//运行出异常
        Field age = aClass.getField("age");
        System.out.println(age.get(o));//传统写法 对象.成员变量,反射:成员变量对象.get(对象)

        Constructor constructor = aClass.getConstructor();//中可以指定构造器参数类型，返回无参构造器
        System.out.println(constructor);

        Constructor constructor1 = aClass.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
