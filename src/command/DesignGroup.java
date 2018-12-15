package command;

/************************************************
 *@ClassName : Invoker
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/9 0009 19:52】
 *@Version : 1.0.0
 *************************************************/

public class DesignGroup implements GroupI {
    @Override
    public void add() {
        System.out.println("设计组想办法添加");
    }

    @Override
    public void delete() {
        System.out.println("设计组一下删除了功能");
    }
}


