package bright;

/************************************************
 *@ClassName : CarProductI
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/6 7:24】
 *@Version : 1.0.0
 *************************************************/

public abstract class CarCompanyA {
    // 这是桥梁模式的关键
    private CarA carA;

    public void makeMoney(){
        this.carA.productCar();
        this.carA.sellCar();
    }

    public CarCompanyA(CarA carI) {
        this.carA = carI;
    }
}
