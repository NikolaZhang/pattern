package composite.compositiontransparent;

public class Leaf extends Component {

	@Override
	public void addSubNode(Component component) {
		System.out.println("叶子节点不能添加节点");
	}

	public Leaf(String name) {
		super.name = name;
	}

}
