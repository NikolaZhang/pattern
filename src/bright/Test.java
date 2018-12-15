package bright;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/6 22:04】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        CopyCompany carCompanyCopy = new CopyCompany(new BWMCar());
        carCompanyCopy.makeMoney();
    }
}


