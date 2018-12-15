package singleton;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/29 21:50】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        MainCompany mainCom1 = MainCompany.getInstance();
        mainCom1.getInfo();
        MainCompany mainCom2 = MainCompany.getInstance();
        mainCom2.getInfo();
        System.out.println("====================================");

        MainCompany2 com1 = MainCompany2.getInstance();
        com1.getInfo();
        MainCompany2 com2 = MainCompany2.getInstance();
        com2.getInfo();

        System.out.println("如果每组上下两个的地址相同则单例成功，不过推荐下面的方式");
    }
}
