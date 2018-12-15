package builder;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/4 22:05】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.productBenzCar().run();
        director.productBWMCar().run();

    }
}
