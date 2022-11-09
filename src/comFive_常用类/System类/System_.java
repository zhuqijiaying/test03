package comFive_常用类.System类;

import java.util.Arrays;

/**
 * @author zq
 */
public class System_ {
    public static void main(String[] args) {

        System.out.println("ok1");
        //System.exit(0);//表示程序退出
        System.out.println("ok2");
        /*
            源数组
         * @param      src      the source array.
            从源数组的哪个索引位置开始拷贝
         * @param      srcPos   starting position in the source array.
            表示目标数组，拷贝到哪个数组
         * @param      dest     the destination array.
            把源数组的数据拷贝到目标数组的哪个索引
         * @param      destPos  starting position in the destination data.
            从源数组拷贝多少个数据
         * @param      length   the number of array elements to be copied.
         */
        int arr[]={1,2,3};
        int dest[]=new int[3];
        System.arraycopy(arr,0,dest,0,3);
        System.out.println("dest="+Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
        
    }
}
