package nullobject;

/************************************************
 *@ClassName : AbstractCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 19:30】
 *@Version : 1.0.0
 *************************************************/

public class RealCar extends AbstractCar {
    @Override
    public String getName() {
        return "存在这辆车";
    }

    public RealCar(String name) {
        super.name = name;
    }
}


