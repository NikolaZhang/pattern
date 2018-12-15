package composite.compositiontransparent;

public class Test {
	public static void main(String[] args) {
		Component component1 = new Composite("zhangxu");
		Component component2 = new Composite("lisi");
		Component component3 = new Composite("wangwu");
		Component component4 = new Leaf("xiaozhen");
		Component component5 = new Leaf("xiaochen");
		Component component6 = new Leaf("xiaochenchen");

		component1.addSubNode(component2);
		component1.addSubNode(component3);
		component2.addSubNode(component4);
		component3.addSubNode(component5);
		component1.addSubNode(component6);

		getNodes(component1);
	}

	public static void getNodes(Component component) {
		component.getInfo();
		if(component.getList()==null || component.getList().size() == 0) {
			return;
		}
		for(Component component2 :component.getList()) {
			getNodes(component2);
		}
	}
}
