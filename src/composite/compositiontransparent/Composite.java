package composite.compositiontransparent;

public class Composite extends Component{


	@Override
	public void addSubNode(Component component) {
		super.getList().add(component);
	}

	public Composite(String name) {
		super.name = name;
	}
	
}
