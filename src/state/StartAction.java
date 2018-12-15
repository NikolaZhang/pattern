package state;

/************************************************
 *@ClassName : StartAction
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 21:10】
 *@Version : 1.0.0
 *************************************************/

public class StartAction implements Action {

    @Override
    public void doSomething(Context context) {
        String state = context.getContex();
        System.out.println("ooo当前状态为："+state);
        if("stop".equals(state)){
            System.out.println("生产线已经启动，准备生产了。。。");
            context.setContex("start");
        }else{
            System.out.println("生产线已经启动，不需要再启动");
        }
    }
}


