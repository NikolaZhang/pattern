package observer;

import java.util.Observable;
import java.util.Observer;

public class CheckCar implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("check the car named : "+arg);
	}

}
