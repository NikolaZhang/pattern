package decorator;

/************************************************
 *@ClassName : BWMDecorator
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 21:19】
 *@Version : 1.0.0
 *************************************************/

public class BWMDecorator extends ModelDecoorator {

    public BWMDecorator(CarModel carModel) {
        super(carModel);
    }

    @Override
    public void look() {
        System.out.println("把原来的车拿出来。。。。");
        carModel.look();
        System.out.println("涂上炫酷喷漆");
    }

}


