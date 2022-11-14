package comSix_集合.Collection接口遍历对象3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zq
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book1("三国演义","罗贯中",10.1));
        col.add(new Book1("水浒传","施耐庵",10.5));
        col.add(new Book1("红楼梦","曹雪芹",20.4));
        System.out.println("col="+col);
        //遍历col数组
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while (iterator.hasNext()){//判断是否还有数据   (快捷键 itit 回车) //显示所有快捷键Ctrl+j
            //返回下一个元素,类型是Object
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }
        //3.当退出while循环后，这时iterator迭代器，指向最后的元素
        //iterator.next();//会报异常
        //4.如果需要再次遍历，需要重置迭代器
        iterator=col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        }

}
class Book1{
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}