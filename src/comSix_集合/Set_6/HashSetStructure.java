package comSix_集合.Set_6;

/**
 * @author zq
 */
public class HashSetStructure {
    public static void main(String[] args) {
        /*
            1.HashSet底层是HashMap
            2.添加一个元素时，先得到hash值 -会转成-> 索引值
            3.找到存储数据表table，看这个索引位置是否已经存放的有元素
            4.如果没有，直接加入
            5.如果有，调用equals比较，如果相同，就放弃添加，如果不相同，则添加到最后
            6.在Java8中，如果一条链表的元素个数
            到达TREEIFY THRESHOLD(默认是8)，并且table的大小>=
            MIN TREEIFY CAPACITY(默认64就会进行树化(红黑树)

         */

        //1，HashSet的底层就是HashMap的底层结构
        //2.创建一个数组，数组的类型Node；
        Node[] table = new Node[16];
        System.out.println(table);
        //3.创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack",null);
        john.next = jack;
        Node rose = new Node("Rose", null);
        jack.next = rose;
        System.out.println(table);
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
    }
}
class Node{//结点，存储数据，可以指向下一个结点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

}