package builder;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : CarTemplateI
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/4 21:15】
 *@Version : 1.0.0
 *************************************************/

public abstract class CarTemplateI {
    protected List chooses = new ArrayList();

    protected abstract void wheel();
    protected abstract void light();
    protected abstract void alarm();

    protected final void run(){
        if(chooses.contains("wheel")){
            wheel();
        }
        if(chooses.contains("light")){
            light();
        }
        if(chooses.contains("alarm")){
            alarm();
        }
    }

    public List getChooses() {
        return chooses;
    }
    public void setChooses(List chooses) {
        this.chooses = chooses;
    }
}
