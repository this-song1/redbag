package Demo0723;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Demo0723.User
{
    Member(){ }
    public Member(String name, int money){
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index=random.nextInt(list.size());
        //收完红包之后删除
        Integer removemoney = list.remove(index);
        //更新余额
        int leftmoney = super.getMoney();
        int updatemoney=leftmoney+removemoney;
        super.setMoney(updatemoney);
    }
}
