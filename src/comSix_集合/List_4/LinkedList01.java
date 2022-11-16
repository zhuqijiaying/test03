package comSix_集合.List_4;

/**
 * @author zq
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("韩顺平");
        jack.next = tom;
        tom.next = hsp;
        hsp.pre = tom;
        tom.pre = jack;
        Node first = jack;
        Node last = hsp;

        //遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //1.先创建一个Node结点，name就是Smith
        Node smith = new Node("smith");
        //把下面Smith加入到双向链表
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;
        //让first再次指向jack
        first = jack;
        while(true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
//定义一个Node类，Node对象  表示双向链表的一个节点
class Node{
    public Object item;//真正存放数据
    public Node next;//指向后一个结点
    public Node pre;
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name="+item;
    }
}