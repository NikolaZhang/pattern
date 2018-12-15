package memento;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 15:41】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        CarRecord carRecord = new CarRecord("aaaa");
        carRecord.changeName("bbbbb");
        carRecord.changeName("ccccc");
        carRecord.changeName("ddddd");
        carRecord.changeName("eeeee");

        System.out.println(carRecord.getName());
        System.out.println(carRecord.getNameFromMemList(1));
        System.out.println(carRecord.getName());
    }
}


