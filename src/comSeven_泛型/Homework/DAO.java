package comSeven_泛型.Homework;

import java.util.*;

/**
 * @author zq
 */
//定义个泛型类DAO<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();
    //(1) public void save(String id,T entity)：保存T类型的对象到 Map成员变量中
    public void save(String id,T entity){
        map.put(id, entity);
    }
    //(2) public T get(String id):从 map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }
    //(3) public void update(String id,T entity)：替换map中key为id的内容，改为entity对象
    public void update(String id,T entity){
        map.put(id,entity);
    }
    //(4) public List<T>list():返回 map中存放的所有T对象
    //1.返回map中存放的所有T对象
    //2.遍历map[k-v]，将map的所有value(T entity),封装到ArrayList返回即可
    public List<T> list(){
        //创建ArrayList
        ArrayList<T> list = new ArrayList<>();
        //遍历map
        Set<String> strings = map.keySet();
        for (Object key :strings) {
            list.add(map.get(key));
        }
        return list;
    }
    //(5) public void delete(String id)：删除指定id 对象
    public void delete(String id){
        map.remove(id);
    }
}
