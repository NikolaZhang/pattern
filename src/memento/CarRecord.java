package memento;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 15:41】
 *@Version : 1.0.0
 *************************************************/

public class CarRecord {
    private String name;

    public String getName() {
        return name;
    }

    public String getNameFromMemList(int index) {
        String name = MemList.getMemRecord(index).getName();
        this.name = name;
        return  name;
    }

    public void changeName(String name){
        this.name = name;
        new MemRecord(name);
    }

    public CarRecord(String name) {
        this.name = name;
        new MemRecord(name);
    }
}


