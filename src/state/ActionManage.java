package state;

/************************************************
 *@ClassName : ActionMange
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 22:18】
 *@Version : 1.0.0
 *************************************************/

public class ActionManage {
    private Action startAction = new StartAction();
    private Action runAction = new RunAction();
    private Action stopAction = new StopAction();
    private Context context;

    public void doSomething(){
        switch (context.getContex()) {
            case "stop" : startAction.doSomething(context);break;
            case "start" : runAction.doSomething(context);break;
            case "run" : stopAction.doSomething(context);break;
        }
    }

    public ActionManage(Context context) {
        this.context = context;
    }
}


