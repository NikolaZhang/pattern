package interpretor;

/************************************************
 *@ClassName : Context
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 13:24】
 *@Version : 1.0.0
 *************************************************/

public class Context {
    private String condition;
    private String value;
    private String expression;


    public Context(String condition, String value, String expression) {
        this.condition = condition;
        this.value = value;
        this.expression = expression;
    }

    public String getCondition() {
        return condition;
    }

    public String getValue() {
        return value;
    }

    public String getExpression() {
        return expression;
    }
}


