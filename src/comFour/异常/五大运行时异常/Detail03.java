package comFour.异常.五大运行时异常;
//数组下标越界异常(ArrayIndexOutOfBoundsException)
public class Detail03 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for (int i = 0; i <=arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
