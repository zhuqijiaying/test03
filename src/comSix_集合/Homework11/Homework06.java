package comSix_集合.Homework11;

/**
 * @author zq
 */
/*
    Vector和ArrayList的比较
                底层结构        版本      线程安全        扩容倍数

    ArrayList   可变数组        jdk1.2   不安全，效率高   有参1.5倍扩
                                                      无参第一次10，第二次开始按照1.5倍扩
                                                      
    Vector      可变数组        jdk1.0   安全，效率低     无参，默认10，按照2倍扩
                Object[]                              指定大小创建，每次按照2倍扩


 */
