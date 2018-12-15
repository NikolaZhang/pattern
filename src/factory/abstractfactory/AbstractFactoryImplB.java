package factory.abstractfactory;

/************************************************
 *@ClassName : AbstractFactoryImplA
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/27 21:15】
 *@Version : 1.0.0
 *************************************************/

public class AbstractFactoryImplB extends AbstractFactory {
    @Override
    Car getCar() {
        return new BWMCar();
    }

    @Override
    Man getMan() {
        return new Female();
    }
}
