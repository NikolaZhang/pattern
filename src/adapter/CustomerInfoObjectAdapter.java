package adapter;

/************************************************
 *@ClassName : CustomerInfoObjectAdapter
 *@Description : 使用对象适配器
 *@Author : NikolaZhang
 *@Date : 【2018/12/2 21:24】
 *@Version : 1.0.0
 *************************************************/

public class CustomerInfoObjectAdapter implements CompanyHereI {
    private CompanyRemoteI companyRemoteI;

    @Override
    public String getCustomerName() {
        return this.companyRemoteI.getCustomerBaseInfo().get("name");
    }

    @Override
    public String getCustomerPhone() {
        return this.companyRemoteI.getCustomerBaseInfo().get("phone");
    }

    @Override
    public String getCustomerAddress() {
        return this.companyRemoteI.getCustomerBaseInfo().get("address");
    }

    @Override
    public String getCustomerTel() {
        return this.companyRemoteI.getCustomerBaseInfo().get("tel");
    }

    public CustomerInfoObjectAdapter(CompanyRemoteI companyRemoteI){
        this.companyRemoteI = companyRemoteI;
    }
}
