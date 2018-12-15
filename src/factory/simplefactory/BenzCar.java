package factory.simplefactory;

/************************************************
 *@ClassName : BenzCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/26 21:20】
 *@Version : 1.0.0
 *************************************************/

public class BenzCar implements Car{
    @Override
    public void run() {
        System.out.println("奔驰车跑起来！");
    }
}
