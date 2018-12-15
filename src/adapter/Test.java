package adapter;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/2 21:28】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        CompanyHereI companyHereICls = new CustomerInfoClassAdapter();
        System.out.println(companyHereICls.getCustomerName());

        CompanyHereI companyHereIObj = new CustomerInfoObjectAdapter(new CompanyRemoteImpl());
        System.out.println(companyHereIObj.getCustomerPhone());
    }
}
