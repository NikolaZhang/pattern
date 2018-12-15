package strategy;

import singleton.MainCompany2;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/28 21:58】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        StartWork startWork1 = new StartWork(new BuyMetalImpl());
        startWork1.start();
        StartWork startWork2 = new StartWork(new DesignCarModelImpl());
        startWork2.start();
        StartWork startWork3 = new StartWork(new MakeCarImpl());
        startWork3.start();
    }
}
