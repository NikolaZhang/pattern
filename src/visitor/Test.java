package visitor;

import iterator.Car;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 7:44】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        VisitorI visitorI = new Visitor();
        CarFacoriresI carFacoriresI1 = new BWMFactory();
        carFacoriresI1.accept(visitorI);
        CarFacoriresI carFacoriresI2 = new BenzFactory();
        carFacoriresI2.accept(visitorI);
    }
}


