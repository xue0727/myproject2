package com.xue.ticket;

public class StudentTicket extends NormalTicket{
int studentprice ;
    public StudentTicket(Station start,Station end){
        super(start, end);
    }

    @Override
    public void print() {
        studentprice = (int)(price*0.9);
        System.out.println(start.name + "\t" + end.name + "\t" + studentprice);
    }
}
