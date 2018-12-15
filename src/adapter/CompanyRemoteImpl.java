package adapter;

import java.util.HashMap;
import java.util.Map;

/************************************************
 *@ClassName : CompanyRemote
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/1 11:40】
 *@Version : 1.0.0
 *************************************************/

public class CompanyRemoteImpl implements CompanyRemoteI{
    @Override
    public Map<String, String> getCustomerBaseInfo() {
        Map<String, String> map = new HashMap();
        map.put("name", "张旭");
        map.put("phone", "17812345678");
        return map;
    }

    @Override
    public Map<String, String> getCustomerHomeInfo() {
        Map<String, String> map = new HashMap();
        map.put("name", "张旭");
        map.put("tel", "123456");
        map.put("address", "上海市静安区");
        return map;
    }
}
