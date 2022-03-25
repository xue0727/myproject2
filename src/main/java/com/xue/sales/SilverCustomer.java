package com.xue.sales;

public class SilverCustomer extends customer{
    int point;

    public SilverCustomer (String name, int money){
        super(name,money);
    }


    public void print() {
            point =(int)(money*0.1f);
        System.out.println(name + "\t" + money + "\t" + result() + "\t" + point);
    }
}
