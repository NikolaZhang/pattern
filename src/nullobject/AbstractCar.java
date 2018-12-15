package nullobject;

import util.StringUtil;

/************************************************
 *@ClassName : AbstractCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 19:30】
 *@Version : 1.0.0
 *************************************************/

public abstract class AbstractCar {
    protected String name;
    public boolean isNull(){
        if(StringUtil.isEmpty(this.name)){
            return true;
        }else{
            return false;
        }
    }
    public abstract String getName();
}


