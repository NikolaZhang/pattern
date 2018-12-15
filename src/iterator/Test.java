package iterator;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/10 0010 21:21】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        Car car = new CarImpl();
        car.addCar("宝马", "1000000");
        car.addCar("奔驰", "2000000");

        Iterator iterator = car.getIterator();
        while(iterator.hasNext()){
            CarImpl car1 = (CarImpl) iterator.next();
            System.out.println(car1.getCarName()+"价格："+car1.getPrice());
        }

    }
}


