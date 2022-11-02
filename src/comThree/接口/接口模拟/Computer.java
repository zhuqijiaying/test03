package comThree.接口.接口模拟;

public class Computer {
    //编写一个方法，计算机工作，老师规定的，即规范
    public void work(UsbInterface usbInterface){
        //通过接口，调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
