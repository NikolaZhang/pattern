package strategy;

import com.sun.org.omg.SendingContext.CodeBaseHelper;

/************************************************
 *@ClassName : StartWork
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/11/28 21:14】
 *@Version : 1.0.0
 *************************************************/

public class StartWork {
    private CreateCarI createCarI;

    public StartWork(CreateCarI createCarI){
        this.createCarI = createCarI;
    }

    public void start(){
        createCarI.doingSomething();
    }
}
