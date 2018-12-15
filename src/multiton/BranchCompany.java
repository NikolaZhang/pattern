package multiton;

import java.util.HashMap;
import java.util.Map;

/************************************************
 *@ClassName : multiton
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/30 21:07】
 *@Version : 1.0.0
 *************************************************/

public class BranchCompany {
    private static Map<String, BranchCompany> map = new HashMap<>();
    private String info;
    static {
        // 预先设置两个分公司
        BranchCompany bjCom = new BranchCompany();
        bjCom.setInfo("这是北京的公司");
        System.out.println("北京的分公司："+bjCom);
        map.put("beijing", bjCom);
        BranchCompany shCom = new BranchCompany();
        shCom.setInfo("这是上海的公司");
        map.put("shanghai", shCom);
        System.out.println("上海的分公司："+shCom);
        System.out.println("==============================");
    }

    public static BranchCompany getInstance(String address){
        return map.get(address);
    }

    public void getInfo(){
        System.out.println(this.info+"/"+this);
    }

    public void setInfo(String info){
        this.info = info;
    }
}
