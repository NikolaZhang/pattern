package observer;

import java.util.Observable;

public class Beltline extends Observable {
	
	public void productCar(String carName) {
		System.out.println("start producting car");
		super.setChanged();
		super.notifyObservers(carName);;
	}
}
