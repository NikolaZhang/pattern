package factory.abstractfactory;

/************************************************
 *@ClassName : Male
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 20:52】
 *@Version : 1.0.0
 *************************************************/

public class Male implements Man {
    @Override
    public void driver() {
        System.out.println("男人");
    }
}
