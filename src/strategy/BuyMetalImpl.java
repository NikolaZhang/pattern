package strategy;

/************************************************
 *@ClassName : BuyMetal
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/28 21:09】
 *@Version : 1.0.0
 *************************************************/

public class BuyMetalImpl implements CreateCarI {

    @Override
    public void doingSomething() {
        System.out.println("购买金属材料。");
    }
}
