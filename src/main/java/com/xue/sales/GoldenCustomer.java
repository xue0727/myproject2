package com.xue.sales;

public class GoldenCustomer extends customer{
    int point;
    int moneyover;

    public GoldenCustomer (String name, int money){
        super(name,money);
    }

    @Override
    public void print() {
        moneyover =(int)(money*0.9f);
        point =(int)(money*0.1f);
        System.out.println(name + "\t" + money + "\t" + moneyover + "\t" + "(" + point + ")");
    }
}
