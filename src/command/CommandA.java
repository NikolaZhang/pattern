package command;

/************************************************
 *@ClassName : Invoker
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 19:52】
 *@Version : 1.0.0
 *************************************************/

public abstract class CommandA {
    protected WorkGroup workGroup = new WorkGroup();
    protected DesignGroup designGroup = new DesignGroup();

    public abstract void execute(String str) ;


}


