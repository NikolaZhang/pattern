package builder;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : Director
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/5 20:39】
 *@Version : 1.0.0
 *************************************************/

public class Director {
    private Builder builder = new Builder();
    private List list = new ArrayList();

    public CarTemplateI productBWMCar(){
        list.clear();
        list.add("wheel");
        list.add("alarm");
        builder.setChoose(list);
        return builder.getCarTemplate(new BWMCarImpl());
    }

    public CarTemplateI productBenzCar(){
        list.clear();
        list.add("wheel");
        list.add("light");
        list.add("alarm");
        builder.setChoose(list);
        return builder.getCarTemplate(new BenzCarImpl());
    }


}
