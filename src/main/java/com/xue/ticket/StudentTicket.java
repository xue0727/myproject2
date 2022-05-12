package com.xue.ticket;

public class StudentTicket extends NormalTicket{

    public StudentTicket(Station start,Station end, int number){
        super(start, end, number);
    }

    @Override
    public void print() {
        price = price - (int)(price*0.1);
        sum = sum + price;
        System.out.println(start.name + "\t" + end.name + "\t" + price);
    }
}
