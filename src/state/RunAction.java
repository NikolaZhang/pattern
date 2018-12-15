package state;

/************************************************
 *@ClassName : StartAction
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 21:10】
 *@Version : 1.0.0
 *************************************************/

public class RunAction implements Action{

    @Override
    public void doSomething(Context context) {
        String state = context.getContex();
        System.out.println("ooo当前状态为："+state);
        if("start".equals(state)){
            System.out.println("生产线开始运行，money,money! happy,happy!");
            context.setContex("run");
        }else{
            System.out.println("生产线不是启动状态无法运行");
        }
    }
}


