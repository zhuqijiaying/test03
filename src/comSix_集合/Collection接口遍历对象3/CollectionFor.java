package comSix_集合.Collection接口遍历对象3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zq
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("水浒传","施耐庵",10.5));
        col.add(new Book("红楼梦","曹雪芹",20.4));

        //使用增强for循环(快捷键(I)) ,类似简化版的迭代器在Collection集合
        for (Object book : col){
            System.out.println("book="+book);
        }
        //增强for，也可以在数组
        int arr[]={1,34,54,65,76};
        for (int i : arr){
            System.out.println("i="+i);
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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