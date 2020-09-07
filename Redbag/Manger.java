package Demo0723;

import Demo0721.Manager;
import javafx.scene.transform.Scale;

import java.util.ArrayList;

public class Manger extends Demo0723.User
{
    Manger() {
    }

    public Manger(String name, int money)
    {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count)
    {
        ArrayList<Integer> redlist=new ArrayList<>();
        int money = super.getMoney();
        //判断
        if (totalMoney>money){
            System.out.println("余额不足");
        }
        //扣钱
        super.setMoney(money-totalMoney);
        //每个人发的钱
        int avg=totalMoney/count;
        //除不开余出来的钱
        int mod=totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last=avg+mod;
        redlist.add(last);
        return redlist;
    }
}
