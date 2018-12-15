package composite.compositiontransparent;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	protected String name;
	private List<Component> list = new ArrayList<>();
	
	public abstract void addSubNode(Component component);
	public void getInfo() {
		System.out.println(this.name);
	}

	public List<Component> getList() {
		return list;
	}
	public void setList(List<Component> list) {
		this.list = list;
	}
	
}
