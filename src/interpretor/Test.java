package interpretor;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 9:30】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        String input = "select _value where name = _name";
        Context context = new Context("zhangsan", "age", input);

        Expression tExp = new TerminalExpression();
        Expression ntExp = new NonTerminalExpression(tExp);
        ntExp.interpreter(context);

    }
}


