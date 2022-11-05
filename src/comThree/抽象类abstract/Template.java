package comThree.抽象类abstract;

abstract public class Template {//抽象类  模板设计模式
    public abstract void job();//抽象方法
    public void calTime(){//实现方法，调用job方法
        //得到开始时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 "+(end-start));
    }
}
