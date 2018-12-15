package factory.simplefactory;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/26 21:30】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        CarFactory.getCar("factory.simplefactory.BenzCar").run();
        CarFactory.getCar("factory.simplefactory.BWMCar").run();
    }
}
