package composite.compostitionsafe;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component> list = new ArrayList<>();
	
	public void addSubNode(Component component) {
		component.pname = this.name;
		list.add(component);
	}

	public void getNodes(){
		getInfo();
		for(Component component :this.list){
			if(Leaf.class.isInstance(component)){
				((Leaf)component).getInfo();
				continue;
			}
			((Composite) component).getNodes();
		}
	}
	
	public Composite(String name) {
		super.name = name;
	}
	
}
