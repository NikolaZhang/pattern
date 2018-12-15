package singleton;

/************************************************
 *@ClassName : single
 *@Description : 第一种单例模式，懒汉模式
 *@Author : NikolaZhang
 *@Date : 【2018/11/29 21:47】
 *@Version : 1.0.0
 *************************************************/

public class MainCompany {
    private static MainCompany mainCompany = null;
    public static MainCompany getInstance(){
        if(mainCompany == null){
            mainCompany = new MainCompany();
        }
        return mainCompany;
    }

    public static void getInfo(){
        System.out.println("总部只能有一个！"+mainCompany);
    }
}
