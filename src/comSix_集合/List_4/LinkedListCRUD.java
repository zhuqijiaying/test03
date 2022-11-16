package comSix_集合.List_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zq
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);


        linkedList.remove();//默认删除第一个
        //linkedList.remove(2);

        linkedList.set(1,99);//修改下标为1的为99
        System.out.println(linkedList);

        Object o = linkedList.get(1);//获取下标为1的值
        System.out.println(o);

        //迭代器遍历
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        /*
        //2.此时LinkedList的属性first = null   last = null
        //3.执行添加
            public boolean add(E e) {
                linkLast(e);
                return true;
            }
          4.将新的结点加入到双向链表的最后
          void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
         */

    }
}
