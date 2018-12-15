package decorator;

/************************************************
 *@ClassName : ModelDecoorator
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 21:17】
 *@Version : 1.0.0
 *************************************************/

public abstract class ModelDecoorator {
    protected CarModel carModel;
    public abstract void look();

    public ModelDecoorator(CarModel carModel) {
        this.carModel = carModel;
    }
}


