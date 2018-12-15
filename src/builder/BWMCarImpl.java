package builder;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : BWMCarImpl
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/4 21:16】
 *@Version : 1.0.0
 *************************************************/

public class BWMCarImpl extends   CarTemplateI {
    @Override
    public void wheel() {
        System.out.println("宝马车轮子");
    }

    @Override
    public void light() {
        System.out.println("宝马车灯");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车鸣笛");
    }

    public List getChooses() {
        return chooses;
    }


}
