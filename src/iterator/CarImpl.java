package iterator;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : CarImpl
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/10 0010 21:13】
 *@Version : 1.0.0
 *************************************************/

public class CarImpl implements Car{
    private List<Car> list = new ArrayList<>();
    private String carName;
    private String price;

    @Override
    public void addCar(String carName, String price) {
        list.add(new CarImpl(carName, price));
    }

    @Override
    public Iterator getIterator() {
        return new CarIterator(list) ;
    }

    private CarImpl(String carName, String price) {
        this.carName = carName;
        this.price = price;
    }

    public CarImpl() {
    }

    public String getCarName() {
        return carName;
    }

    public String getPrice() {
        return price;
    }
}


