package comThree.抽象类abstract;

public class AbstractExercise {
    public static void main(String[] args) {
        Manager manager = new Manager("jack",23,20000);
        manager.setBonus(2000);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("xwang",12,120934);
        commonEmployee.work();
    }
}

