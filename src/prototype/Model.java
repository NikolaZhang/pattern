package prototype;


public class Model implements Cloneable {
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

    protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Model(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
