package comFive_常用类.StringBuffer类;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("夏文建");
        s.append("的大哥");
        s.append(":");
        s.append("朱祺");
        System.out.println(s);
        //删除
        s.delete(4,5);//[4,5)
        System.out.println(s);
        //修改
        s.replace(4,5,"大大哥");
        System.out.println(s);
        //查找
        int indexOf = s.indexOf("文");
        System.out.println(indexOf);
        //插入
        s.insert(8,"是");
        System.out.println(s);
        //长度
        System.out.println(s.length());
        System.out.println(s);

    }
}
