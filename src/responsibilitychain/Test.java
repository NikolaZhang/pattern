package responsibilitychain;

/************************************************
 *@ClassName : Test
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/12 0012 21:45】
 *@Version : 1.0.0
 *************************************************/

public class Test {
    public static void main(String[] args) {
        Position master = new Master(1,  "大BOSS");
        Position leader = new Leader(2,  "组长");
        Position worker = new Worker(3,  "劳动者");
        master.setNextPosition(leader);
        leader.setNextPosition(worker);
        master.giveNotice(3,  "今晚吃个饭");
        master.giveNotice(2,  "饭后唱个K");

    }
}


