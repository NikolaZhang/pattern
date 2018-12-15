package multiton;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 21:17】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        BranchCompany bj = BranchCompany.getInstance("beijing");
        bj.getInfo();
        BranchCompany sh = BranchCompany.getInstance("shanghai");
        sh.getInfo();
    }
}
