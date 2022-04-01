package com.xue.sales;

public class PlatinumCustomer extends GoldenCustomer{

    public PlatinumCustomer(String name, int money){
        super(name,money);
    }

    @Override
    public void print() {
        moneyover =(int)(money*0.7f);
        point =(int)(money*0.2f);
        System.out.println(name + "\t" + money + "\t" + moneyover + "\t" + "(" + point + ")");
    }
}
