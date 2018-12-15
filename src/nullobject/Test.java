package nullobject;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 17:34】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        System.out.println(CarFactory.getCar("bwm").getName());
        System.out.println(CarFactory.getCar("asdfsa").getName());
    }
}


