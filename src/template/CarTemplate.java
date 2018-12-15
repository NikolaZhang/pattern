package template;

/************************************************
 *@ClassName : CarTemplate
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/3 20:38】
 *@Version : 1.0.0
 *************************************************/

public abstract class CarTemplate {
    protected abstract void door();
    protected abstract void wheel();
    protected abstract void light();
    protected abstract void aiCtrl();

    public final void run() {
        door();
        wheel();
        light();
        if(isAiCtrl()) {
            aiCtrl();
        }
    }

    protected boolean isAiCtrl(){
        System.out.println("父类中设置开启AI");
        return true;
    }
}
