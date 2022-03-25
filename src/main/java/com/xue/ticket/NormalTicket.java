package com.xue.ticket;

public class NormalTicket {
    public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;

    Station start;
    Station end;
    int number;
    int price;

    public  NormalTicket (Station start, Station end, int number){
        this.start = start;
        this.end = end;
        this.number = number;
    }

    public void print() {
        System.out.println(start + "\t" + end + "\t" + number );
    }
    public int result(){


        return price;
    }
}
