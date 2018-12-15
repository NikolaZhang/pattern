package flyweight;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 14:40】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        System.out.println(CarFactory.getInstance("bwm1","black"));
        System.out.println(CarFactory.getInstance("bwm1","grey"));
        System.out.println(CarFactory.getInstance("bwm2","grey"));
        System.out.println(CarFactory.getInstance("bwm1","blue"));
    }
}


