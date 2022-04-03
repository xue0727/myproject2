package com.xue.ticket;

public class OlderTicket extends StudentTicket {
    int olderprice;
    public OlderTicket(Station start, Station end){
        super(start, end);
    }
    @Override
    public void print() {
        olderprice = (int)(price*0.5);
        System.out.println(start.name + "\t" + end.name + "\t" + olderprice);
    }
}
