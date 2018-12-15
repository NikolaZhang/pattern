package adapter;

/************************************************
 *@ClassName : CustomerInfoConvertAdapter
 *@Description : 使用类适配器
 *@Author : NikolaZhang
 *@Date : 【2018/12/2 21:20】
 *@Version : 1.0.0
 *************************************************/

public class CustomerInfoClassAdapter  extends CompanyRemoteImpl implements CompanyHereI{
    @Override
    public String getCustomerName() {
        return super.getCustomerBaseInfo().get("name");
    }

    @Override
    public String getCustomerPhone() {
        return super.getCustomerBaseInfo().get("phone");
    }

    @Override
    public String getCustomerAddress() {
        return super.getCustomerHomeInfo().get("address");
    }

    @Override
    public String getCustomerTel() {
        return super.getCustomerHomeInfo().get("tel");
    }
}
