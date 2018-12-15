package builder;

import java.util.List;

/************************************************
 *@ClassName : BenzCarImpl
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/4 21:57】
 *@Version : 1.0.0
 *************************************************/

public class BenzCarImpl extends CarTemplateI {

    @Override
    public void wheel() {
        System.out.println("奔驰车轮子");
    }

    @Override
    public void light() {
        System.out.println("奔驰车灯");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    public List getChooses() {
        return chooses;
    }


}
