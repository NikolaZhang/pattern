package state;

/************************************************
 *@ClassName : StartAction
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 21:10】
 *@Version : 1.0.0
 *************************************************/

public class StopAction implements Action{

    @Override
    public void doSomething(Context context) {
        String state = context.getContex();
        System.out.println("ooo当前状态为："+state);
        if("start".equals(state) || "run".equals(state)){
            System.out.println("生产线停了！");
            context.setContex("stop");
        }else{
            System.out.println("生产线并没有运行！");
        }
    }

}


