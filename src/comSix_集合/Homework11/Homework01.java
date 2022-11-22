package comSix_集合.Homework11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zq
 */
/*
(1)封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象
        时只打印标题：
        (2)只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
        新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
        新闻二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
        (3)将新闻对象添加到ArrayList集合中，并且进行倒序遍历；
        (4)在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后在后边加”…”
        (5)在控制台打印遍历出经过处理的新闻标题；
*/
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News( "新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧","真的");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜中，捞起一看赶快放生","假的");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);
        int size = arrayList.size();
        for (int i = size-1;i>=0;i--){
            News news = (News)arrayList.get(i);
            System.out.println(news.getName());
        }

    }
}
class News{
    private String name;
    private String detail;

    public News(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        if(name == null){
            return "";
        }
        if(name.length()>15){
            return name.substring(0,15)+"...";
        }else {
            return name;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
}