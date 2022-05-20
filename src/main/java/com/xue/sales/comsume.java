package com.xue.sales;

import java.util.ArrayList;
import java.util.List;

public class comsume {
    public static void main(String[] args) {
        List<customer> customers = new ArrayList<>();
        customers.add(new customer("c1", 1200));
        customers.add(new SilverCustomer("c2", 2000));
        customers.add(new SilverCustomer("c3", 3598));
        customers.add(new GoldenCustomer("c4", 5000));
        customers.add(new PlatinumCustomer("c5", 6000));

        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (customer c:customers) {
            c.print();
        }
        customers.get(0).print();
        MyClass c = new MyClass();
        c.print();
        }
    }

