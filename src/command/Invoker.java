package command;

/************************************************
 *@ClassName : Invoker
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 19:52】
 *@Version : 1.0.0
 *************************************************/

public class Invoker {
    private CommandA commandA;

    public void setCommandA(CommandA commandA) {
        this.commandA = commandA;
    }

    public void action(String str){
        commandA.execute(str);
    }
}


