package command;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 20:11】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        CommandA commandWork = new WorkCommand();
        invoker.setCommandA(commandWork);
        invoker.action("add");
        invoker.action("delete");
        invoker.action("update");

    }
}


