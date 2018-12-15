package facade;

/************************************************
 *@ClassName : MakeCarImpl
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 21:43】
 *@Version : 1.0.0
 *************************************************/

public class MakeCarImpl implements MakeCarI {

    @Override
    public void findMetal() {
        System.out.println("找点金属");
    }

    @Override
    public void designCar() {
        System.out.println("画个图纸");
    }

    @Override
    public void createCar() {
        System.out.println("开始生产");
    }
}
