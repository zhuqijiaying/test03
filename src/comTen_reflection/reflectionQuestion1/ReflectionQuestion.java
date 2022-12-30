package comTen_reflection.reflectionQuestion1;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zq
 */
@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //传统方法
//        Cat cat = new Cat();
//        cat.hi();

//        //使用Properties类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\comTen_reflection\\properties_\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath"+classfullpath);
        System.out.println("method"+method);

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

    }
}
