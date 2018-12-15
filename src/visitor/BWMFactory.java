package visitor;

/************************************************
 *@ClassName : BWMFactory
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 7:36】
 *@Version : 1.0.0
 *************************************************/

public class BWMFactory implements CarFacoriresI {
    @Override
    public void info(){
        System.out.println("宝马工厂最近亏损");
    }

    @Override
    public void accept(VisitorI visitorI) {
        visitorI.visit(this);
    }
}


