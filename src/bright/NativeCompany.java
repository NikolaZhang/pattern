package bright;

/************************************************
 *@ClassName : NativeCompany
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/6 22:12】
 *@Version : 1.0.0
 *************************************************/

public class NativeCompany extends CarCompanyA {
    public NativeCompany() {
        super(new NationalCar());
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("本土车赚钱哦");
    }
}


