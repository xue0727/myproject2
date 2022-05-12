package com.xue.ticket;

public class OlderTicket extends StudentTicket {

    public OlderTicket(Station start, Station end, int number){
        super(start, end, number);
    }
    @Override
    public void print() {
        price = (int)(price*0.5);
        sum = sum + price;
        System.out.println(start.name + "\t" + end.name + "\t" + price);
    }
}
