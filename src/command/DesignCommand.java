package command;

/************************************************
 *@ClassName : DesignCommand
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 20:08】
 *@Version : 1.0.0
 *************************************************/

public class DesignCommand extends CommandA{

    @Override
    public void execute(String str) {
        if("add".equals(str)){
            super.designGroup.add();
        } else if("delete".equals(str)){
            super.designGroup.delete();
        }else {
            System.out.println("没有该命令");
        }

    }
}


