package com.xue.ticket;

public class OlderTicket extends StudentTicket {
    int olderprice;
    public OlderTicket(Station start, Station end, int number){
        super(start, end, number);
    }
    @Override
    public void print() {
        olderprice = (int)(price*0.5);
        System.out.println(start.name + "\t" + end.name + "\t" + olderprice);
    }
}
