package nullobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/************************************************
 *@ClassName : CarFactory
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 19:39】
 *@Version : 1.0.0
 *************************************************/

public class CarFactory {
    private static List<String> cars = new ArrayList<>();
    static {
        cars.add("bwm");
        cars.add("benz");
    }
    public static AbstractCar getCar(String name){
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            if(name.equals(iterator.next())) {
                return new RealCar(name);
            }
        }
        return new NullCar();
    }
}


