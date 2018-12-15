package command;

/************************************************
 *@ClassName : DesignCommand
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 20:08】
 *@Version : 1.0.0
 *************************************************/

public class WorkCommand extends CommandA{

    @Override
    public void execute(String str) {
        if("add".equals(str)){
            super.workGroup.add();
        } else if("delete".equals(str)){
            super.workGroup.delete();
        }else {
            System.out.println("工作组拒绝该命令");
        }

    }
}


