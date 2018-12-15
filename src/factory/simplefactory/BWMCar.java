package factory.simplefactory;

/************************************************
 *@ClassName : BWMCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/26 21:20】
 *@Version : 1.0.0
 *************************************************/

public class BWMCar implements Car{
    @Override
    public void run() {
        System.out.println("宝马跑起来！");
    }
}
