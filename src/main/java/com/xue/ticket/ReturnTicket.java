package com.xue.ticket;

public class ReturnTicket extends StudentTicket{
    int returnticket;
    public ReturnTicket (Station start, Station end, int number){
        super(start, end, number);
    }

    @Override
    public void print() {
        super.print();
    }
}
