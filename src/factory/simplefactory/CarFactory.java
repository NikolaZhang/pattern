package factory.simplefactory;

import util.StringUtil;

/************************************************
 *@ClassName : CarFactory
 *@Description : 简单工厂， 使用反射实例化对象
 *@Author : NikolaZhang
 *@Date : 【2018/11/26 21:14】
 *@Version : 1.0.0
 *************************************************/

public class CarFactory {
    private CarFactory(){}
    public static Car getCar(String carName) {
        if(!StringUtil.isEmpty(carName)){
            try {
                return (Car) Class.forName(carName).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
