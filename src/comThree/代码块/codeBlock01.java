package comThree.代码块;

public class codeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好");
        Movie movie1 = new Movie("hh", 12, "me");
        Movie movie2 = new Movie("dd",13);
    }

}
class Movie{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("播放");
    };
    public Movie(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}