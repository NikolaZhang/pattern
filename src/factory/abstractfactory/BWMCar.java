package factory.abstractfactory;

/************************************************
 *@ClassName : BWMCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 20:46】
 *@Version : 1.0.0
 *************************************************/

public class BWMCar implements Car {
    @Override
    public void run() {
        System.out.println("宝马车跑起来！");
    }
}
