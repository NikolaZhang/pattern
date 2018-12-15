package proxy;

/************************************************
 *@ClassName : CompanyB
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/29 20:29】
 *@Version : 1.0.0
 *************************************************/

public class CompanyDad implements CompanyWorkI {
    private CompanyWorkI companyWorkI;

    public CompanyDad(CompanyWorkI companyWorkI){
        this.companyWorkI = companyWorkI;
    }
    public CompanyDad(){
        this.companyWorkI = new CompanyA();
    }

    @Override
    public void buyMetal() {
        companyWorkI.buyMetal();
    }

    @Override
    public void designCar() {
        companyWorkI.designCar();
    }

    public void makeCar(){
        System.out.println("dad公司生产车");
    }
}
