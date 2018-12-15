package adapter;

import java.util.Map;

/************************************************
 *@ClassName : CompanyRemoteI
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/2 21:10】
 *@Version : 1.0.0
 *************************************************/

public interface CompanyRemoteI {
    Map<String, String> getCustomerBaseInfo();
    Map<String, String> getCustomerHomeInfo();
}
