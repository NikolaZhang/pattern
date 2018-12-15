package flyweight;

import java.util.HashMap;
import java.util.Map;

/************************************************
 *@ClassName : CarFactory
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 15:16】
 *@Version : 1.0.0
 *************************************************/

public class CarFactory {
    private static Map<String, BWMCar> bwmCarMap = new HashMap<>();

    public static BWMCar getInstance(String name, String color){
        BWMCar bwmCar = bwmCarMap.get(name);
        if(bwmCar==null){
            bwmCar = new BWMCar(name, color);
            bwmCarMap.put(name, bwmCar);
        }
        return bwmCar;
    }
}


