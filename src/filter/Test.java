package filter;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 17:20】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("bwm"));
        list.add(new Car("benz"));
        list.add(new Car("BWM"));

        CarFilter carFilter = new CarFilter();
        System.out.println("符合条件的车数："+carFilter.filterCar(list).size());
    }
}


