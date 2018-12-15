package state;

/************************************************
 *@ClassName : Context
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/13 0013 21:05】
 *@Version : 1.0.0
 *************************************************/

public class Context {
    private String context;

    public String getContex() {
        return context;
    }

    public void setContex(String context) {
        this.context = context;
    }

    public Context(String state){
        this.context = state;
    }
}


