package memento;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 15:41】
 *@Version : 1.0.0
 *************************************************/

public class MemRecord {
    private String name;

    public String getName() {
        return name;
    }

    public MemRecord(String name) {
        this.name = name;
        MemList.addMemRecord(this);
    }
}


