package interpretor;

/************************************************
 *@ClassName : NonTerminalExpression
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 9:29】
 *@Version : 1.0.0
 *************************************************/

public class NonTerminalExpression implements Expression {

    private Expression expression;

    public NonTerminalExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void interpreter(Context context) {
        String str = context.getExpression();
        if(str.contains("select") && str.contains("where")&& str.contains("=")){
            System.out.println("ooo条件查询");
            this.expression.interpreter(context);
        }
    }
}


