package filter;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : CarFilter
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 17:20】
 *@Version : 1.0.0
 *************************************************/

public class CarFilter {
    private List<Car> list = new ArrayList<>();

    public List<Car> filterCar(List<Car> listCar){
        for (Car car :listCar){
            if("bwm".equals(car.getName())){
                list.add(car);
            }
        }
        return list;
    }
}


