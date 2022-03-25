package com.xue.sales;

public class GoldenCustomer extends customer{
    int point;

    public GoldenCustomer (String name, int money){
        super(name,money);
    }
    public void print() {
        point =(int)(money*0.2f);
        System.out.println(name + "\t" + money + "\t" + result() + "\t" + point);
    }
}
