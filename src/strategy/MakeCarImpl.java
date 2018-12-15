package strategy;

/************************************************
 *@ClassName : MakeCarImpl
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/28 21:13】
 *@Version : 1.0.0
 *************************************************/

public class MakeCarImpl implements CreateCarI {

    @Override
    public void doingSomething() {
        System.out.println("生产一辆车。");
    }
}
