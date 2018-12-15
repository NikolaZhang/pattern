package factory.methodfactory;

/************************************************
 *@ClassName : CarFactory
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 22:36】
 *@Version : 1.0.0
 *************************************************/

public class CarFactory {
    public static CarCompanyI getCarCompany(String classname)  {
        CarCompanyI interfaces = null;
        try {
            interfaces = (CarCompanyI) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return interfaces;
    }
}