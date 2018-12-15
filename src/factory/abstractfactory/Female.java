package factory.abstractfactory;

/************************************************
 *@ClassName : Female
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 20:53】
 *@Version : 1.0.0
 *************************************************/

public class Female implements Man {
    @Override
    public void driver() {
        System.out.println("女人");
    }
}
