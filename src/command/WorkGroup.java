package command;

/************************************************
 *@ClassName : Invoker
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 19:52】
 *@Version : 1.0.0
 *************************************************/

public class WorkGroup implements GroupI{
    @Override
    public void add() {
        System.out.println("工作组根据命令添加零件");
    }

    @Override
    public void delete() {
        System.out.println("工作组根据命令删除零件");
    }
}


