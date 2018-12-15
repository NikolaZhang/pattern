package factory.methodfactory;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 22:40】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        CarFactory.getCarCompany("factory.methodfactory.CompanyB").buyMetal();
        CarFactory.getCarCompany("factory.methodfactory.CompanyA").buyMetal();
    }
}
