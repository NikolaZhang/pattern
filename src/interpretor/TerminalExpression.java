package interpretor;

/************************************************
 *@ClassName : TerminalExpression
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 9:29】
 *@Version : 1.0.0
 *************************************************/

public class TerminalExpression implements Expression {
    @Override
    public void interpreter(Context context) {
        String name = context.getCondition();
        String value = context.getValue();
        System.out.println("查询条件为name="+name);
        System.out.println("需要的结果是："+value);
        if("age".equals(value) && "zhangsan".equals(name)){
            System.out.println("查询年龄为：23");
        }
    }

}


