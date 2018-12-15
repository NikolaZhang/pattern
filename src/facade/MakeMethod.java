package facade;

/************************************************
 *@ClassName : MakeMethod
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 21:44】
 *@Version : 1.0.0
 *************************************************/

public class MakeMethod {
    private MakeCarI makeCarI = new MakeCarImpl();
    private CheckCar checkCar = new CheckCar();
    public void startMakeCar(){
        makeCarI.findMetal();
        makeCarI.designCar();
        makeCarI.createCar();
        checkCar.check();
    }
}
