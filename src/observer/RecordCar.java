package observer;

import java.util.Observable;
import java.util.Observer;

public class RecordCar implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("record the car named : "+arg);
	}
}
