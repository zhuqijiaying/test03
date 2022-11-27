package comSeven_泛型.自定义泛型接口;

/**
 * @author zq
 */
/*
1.泛型方法，可以定义在普通类中，也可以定义在泛型类
2.当泛型方法被调用时，类型会确定
3.public void eat(E e)，修饰符后没有<T,R..> eat方法不是泛型方法，而是使用了泛型
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",1000);
        car.fly(1,1);
    }
}
class Car{//普通类
    public void run(){

    }
    //<T,R>就是泛型
    //提供给fly使用
    public<T,R> void fly(T t,R r){//泛型方法：定义在普通类中
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }

}
class Fish<T,R>{//泛型类
     public void hi(T t){//不是泛型方法，而是使用了类声明的泛型
     }
     //泛型方法可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r,K k){

    }

    public void eat(){

    }
    public<U,M> void swim(U u,M m){//泛型方法：定义在泛型类中

    }
}