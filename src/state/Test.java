package state;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 21:26】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        Context context = new Context("stop");
        ActionManage actionManage = new ActionManage(context);
        actionManage.doSomething();
        actionManage.doSomething();
        actionManage.doSomething();
        actionManage.doSomething();
    }
}


