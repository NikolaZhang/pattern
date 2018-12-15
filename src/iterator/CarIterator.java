package iterator;


import java.util.List;

/************************************************
 *@ClassName : CarIterator
 *@Description : TODO
 *@Author : NikolaZhang
 *@Date : 【2018/12/10 0010 21:05】
 *@Version : 1.0.0
 *************************************************/

public class CarIterator implements Iterator {
    private List<Car> list;
    private int cnt = 0;
    @Override
    public boolean hasNext() {
        return cnt<list.size()?true:false;
    }

    @Override
    public Car next() {
        Car next = list.get(cnt);
        cnt++;
        return next;
    }

    public CarIterator(List<Car> list) {
        if(list == null){
            System.out.println("集合未实例化");
            return;
        }
        this.list = list;

    }


}


