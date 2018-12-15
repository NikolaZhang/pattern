package prototype;


import java.io.Serializable;

public class ModelS implements Serializable {
	private String name;
	private String price;
    private A a = new A("a");


    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public A getA() {
        return a;
    }

	public ModelS(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
