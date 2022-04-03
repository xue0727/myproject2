package com.xue.ticket;

public class Sum extends OlderTicket{
    int sum;
    public Sum(Station start,Station end, int number){
        super(start, end, number);
    }
    public int sum(){
        sum = price + studentprice + olderprice;
        return sum;
    }
    public void print(){
        System.out.println(sum);
    }
}
