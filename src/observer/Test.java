package observer;

public class Test {
	public static void main(String[] args) {
		Beltline beltline = new Beltline();
		beltline.addObserver(new CheckCar());
		beltline.addObserver(new RecordCar());
		beltline.productCar("BWM");
		beltline.productCar("Benz");
		beltline.productCar("five edges great light");
	}

} 
