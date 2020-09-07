package Demo0723.Redbag;

import Demo0723.Manger;
import Demo0723.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Text
{
    public static void main(String[] args)
    {
        Manger manger = new Manger("群主", 200);
        Member m1 = new Member("成员A",0);
        Member m2 = new Member("成员B",0);
        Member m3 = new Member("成员C",0);
        manger.show();
        m1.show();
        m2.show();
        m3.show();
        System.out.println("请输入金额");
        Scanner scanner;
        scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("请输入发几个红包");
        int count=scanner.nextInt();
        //  调用发红包
        ArrayList<Integer> redlist=manger.send(a,count);

        //调用收红包
        m1.receive(redlist);
        m2.receive(redlist);
        m3.receive(redlist);
        manger.show();
        m1.show();
        m2.show();
        m3.show();
    }
}
