package memento;

import java.util.ArrayList;
import java.util.List;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/15 0015 15:41】
 *@Version : 1.0.0
 *************************************************/

public class MemList {
    private static List<MemRecord> mems;

    static{
        mems = new ArrayList<>();
    }
    private MemList(){}

    public static MemRecord getMemRecord(int index) {
        return mems.get(index);
    }
    public static void addMemRecord(MemRecord mem) {
        mems.add(mem);
    }
}


