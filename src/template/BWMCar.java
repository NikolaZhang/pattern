package template;

/************************************************
 *@ClassName : BWMCar
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/3 20:45】
 *@Version : 1.0.0
 *************************************************/

public class BWMCar extends  CarTemplate {
    private boolean aiCtrl = false;

    @Override
    protected void door() {
        System.out.println("给车加个门");
    }

    @Override
    protected void wheel() {
        System.out.println("给车加个轮");
    }

    @Override
    protected void light() {
        System.out.println("给车加个灯");
    }

    @Override
    protected void aiCtrl() {
        System.out.println("给车加个AI");
    }

    public boolean isAiCtrl() {
        System.out.println("->子类开启AI: "+this.aiCtrl);
        return this.aiCtrl;
    }

    public void setAiCtrl(boolean aiCtrl) {
        this.aiCtrl = aiCtrl;
    }
}
