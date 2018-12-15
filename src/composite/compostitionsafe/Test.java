package composite.compostitionsafe;

public class Test {
	public static void main(String[] args) {
		Composite composite1 = new Composite("zhangxu");
		Composite composite2 = new Composite("lisi");
		Composite composite3 = new Composite("wangwu");
		Leaf leaf1 = new Leaf("xiaozhen");
		Leaf leaf2 = new Leaf("xiaochen");
		
		composite1.addSubNode(composite2);
		composite1.addSubNode(composite3);
		composite2.addSubNode(leaf1);
		composite3.addSubNode(leaf2);
		
		composite1.getNodes();
	}

} 
