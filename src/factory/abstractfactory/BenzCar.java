package factory.abstractfactory;

/************************************************
 *@ClassName : BenzCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 20:47】
 *@Version : 1.0.0
 *************************************************/

public class BenzCar implements Car {
    @Override
    public void run() {
        System.out.println("奔驰车跑起来！");
    }
}
