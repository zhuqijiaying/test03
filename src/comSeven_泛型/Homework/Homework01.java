package comSeven_泛型.Homework;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author zq
 */
/*
定义个泛型类DAO<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类
        分别创建以下方法：
        (1) public void save(String id,T entity)：保存T类型的对象到 Map成员变量中
        (2) public T get(String id):从 map中获取id对应的对象
        (3) public void update(String id,T entity)：替换map中key为id的内容，改为entity对象
        (4) public List<T>list():返回 map中存放的所有T对象
        (5) public void delete(String id)：删除指定id 对象
        定义一个User类：
        该类包含：private成员变量(int类型)id，age;(String类型) name。
        创建DAO类的对象，分别调用其 save、get、update、list、delete方法来操作 User对象，使用Junit单元测试类进行测试。
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        //给泛型<T>指定类型是User
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,23,"jack"));
        dao.save("002",new User(2,22,"jck"));
        dao.save("003",new User(3,21,"jock"));
        List<User> list = dao.list();
        System.out.println(list);
        System.out.println(dao.get("006"));
        dao.update("003",new User(4,34,"bool"));
        dao.delete("001");
        //需要重新获取list
        list = dao.list();
        System.out.println(list);

    }
}

