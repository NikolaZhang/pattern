package mediation;

public class Test {
	public static void main(String[] args) {
		Action com = new CarCompany("车厂");
		Action cusA = new CustomerA("客户A");
		Action cusB = new CustomerB("客户B");
		com.saySomething("我们的车质量好。", cusA,cusB);
		cusA.saySomething("好不好，跑一跑！", com);
        cusB.saySomething("我看这车行！", com);
        com.saySomething("88折卖你了，客户A不知道的。", cusB);
        cusB.saySomething("o了。(＾＾)人(＾＾ )ノ", com);
        cusA.saySomething("你们在说啥....(⊙_⊙)?", com,cusB);

    }
}
