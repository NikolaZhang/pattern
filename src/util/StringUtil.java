package util;

/************************************************
 *@ClassName : StringUtil
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/26 21:23】
 *@Version : 1.0.0
 *************************************************/

public class StringUtil {
    private StringUtil(){}

    public static boolean isEmpty(String str){
        if(str == null || "".equals(str)){
            return true;
        } else{
            return false;
        }
    }

}
