package com.xue.sales;

public class customer {
        String name;
        int money;
        int FinalMoney;

        public customer (String name, int money) {
            this.name = name;
            this.money = money;
        }
        public void print(){
            System.out.println(name + "\t" + money + "\t" + result() + "\t");

    }
    public int result(){
        if(money>=1000){
            FinalMoney = money-(money/1000)*100;
        }else{
            FinalMoney = money;
        }
        return FinalMoney;
    }
}
