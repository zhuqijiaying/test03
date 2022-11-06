package comFour.枚举;

public class RnumDetail {
    public static void main(String[] args) {
        Music.CLASSMUSIC.playing();
    }
}
interface IA{
    public void playing();
}
enum Music implements IA{
    CLASSMUSIC;
    @Override
    public void playing() {
        System.out.println("播放好听的音乐...");
    }

}//不能继承类，因为隐藏继承Enum，但可以实现接口
