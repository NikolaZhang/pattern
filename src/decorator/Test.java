package decorator;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 21:25】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        ModelDecoorator modelDecoorator = new BWMDecorator(new BWMCarModel());
        modelDecoorator.look();
    }
}


