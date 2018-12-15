package visitor;

/************************************************
 *@ClassName : Visitor
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 7:39】
 *@Version : 1.0.0
 *************************************************/

public class Visitor implements VisitorI {
    @Override
    public void visit(BWMFactory bwmFactory) {
        System.out.println("调查宝马工厂");
        bwmFactory.info();
    }

    @Override
    public void visit(BenzFactory benzFactory) {
        System.out.println("调查奔驰工厂");
        benzFactory.info();
    }
}


