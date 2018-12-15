package singleton;

/************************************************
 *@ClassName : MainCompany2
 *@Description : 第二种单例模式，饿汉模式
 *@Author : NikolaZhang
 *@Date : 【2018/11/29 21:59】
 *@Version : 1.0.0
 *************************************************/

public class MainCompany2 {
    private final static MainCompany2 mainCompany2 = new MainCompany2();

    public static MainCompany2 getInstance(){
        return mainCompany2;
    }

    public void getInfo(){
        System.out.println("饿汉模式"+mainCompany2);
    }
}
