package com.xue.ticket;

public class ReturnTicket extends StudentTicket{
    int returnticket;
    public ReturnTicket (Station start, Station end){
        super(start, end);
    }

    @Override
    public void print() {
        super.print();
    }
}
