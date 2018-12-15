package proxy;

/************************************************
 *@ClassName : CompanyA
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/29 20:27】
 *@Version : 1.0.0
 *************************************************/

public class CompanyA implements CompanyWorkI {

    @Override
    public void buyMetal() {
        System.out.println("A公司买材料");
    }

    @Override
    public void designCar() {
        System.out.println("A公司设计车");
    }
}
