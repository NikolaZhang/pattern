package composite.compostitionsafe;

public abstract class Component {
	protected String name;
	protected String pname;

	public void getInfo() {
		System.out.println(this.name+"/属于："+pname);
	}
}
