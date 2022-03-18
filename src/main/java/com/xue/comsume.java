package com.xue;

public class comsume {
    public static void main(String[] args) {
        customer c1 = new customer("c1", 1200);
        c1.print();
        SilverCustomer c2 = new SilverCustomer("c2",2000);
        c2.print();
        SilverCustomer c3 = new SilverCustomer("c3",3598);
        c3.print();
        GoldenCustomer c4 = new GoldenCustomer("c4", 4586);
        c4.print();
    }
}
