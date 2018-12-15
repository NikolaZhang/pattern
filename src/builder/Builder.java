package builder;

import java.util.List;

/************************************************
 *@ClassName : Builder
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/4 21:58】
 *@Version : 1.0.0
 *************************************************/

public class Builder {
    private List list;

    public void setChoose(List list){
        this.list=list;
    }

    public CarTemplateI getCarTemplate(CarTemplateI carTemplateI){
            carTemplateI.setChooses(list);
            return  carTemplateI;
    }
}
