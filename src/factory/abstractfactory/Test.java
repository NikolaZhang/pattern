package factory.abstractfactory;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 21:03】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactoryA = new AbstractFactoryImplA();
        abstractFactoryA.getCar().run();
        abstractFactoryA.getMan().driver();

        AbstractFactory abstractFactoryB = new AbstractFactoryImplB();
        abstractFactoryB.getCar().run();
        abstractFactoryB.getMan().driver();
    }
}

