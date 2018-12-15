package factory.methodfactory;

/************************************************
 *@ClassName : CompanyA
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 22:34】
 *@Version : 1.0.0
 *************************************************/

public class CompanyA implements CarCompanyI{
    @Override
    public void buyMetal() {
        System.out.println("A公司买材料");
    }

    @Override
    public void designCar() {
        System.out.println("A公司设计模型");
    }

    @Override
    public void createCar() {
        System.out.println("A公司生产车");
    }

}
