package factory.methodfactory;

/************************************************
 *@ClassName : CompanyB
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 22:34】
 *@Version : 1.0.0
 *************************************************/

public class CompanyB implements CarCompanyI {
    @Override
    public void buyMetal() {
        System.out.println("B公司买材料");
    }

    @Override
    public void designCar() {
        System.out.println("B公司设计模型");
    }

    @Override
    public void createCar() {
        System.out.println("B公司生产车");
    }
}
