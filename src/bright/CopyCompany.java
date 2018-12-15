package bright;

/************************************************
 *@ClassName : CopyCompany
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/6 22:13】
 *@Version : 1.0.0
 *************************************************/

public class CopyCompany extends CarCompanyA {

    public CopyCompany(CarA car) {
        super(car);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨车赚钱！");
    }
}


