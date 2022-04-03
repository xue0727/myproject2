package com.xue.ticket;

public class NormalTicket {
    public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;

    Station start;
    Station end;
    int price;
    int number;


    public  NormalTicket (Station start, Station end, int number){
        this.start = start;
        this.end = end;
        this.number = number;

        if (start == Station.TAIPEI){
            if (end == Station.TAIPEI){
                System.out.println("error");
            }else if(end == Station.TAICHUNG){
                price = 600*number;
            }else{
                price =1500*number;
            }
        }else if (start == Station.TAICHUNG){
            if (end == Station.TAICHUNG){
                System.out.println("error");
            }else if (end == Station.TAIPEI){
                price = 600*number;
            }else{
                price = 900*number;
            }
        }else if(start == Station.KAOHSIUNG){
            if (end == Station.KAOHSIUNG){
                System.out.println("error");
            }else if (end == Station.TAIPEI){
                price = 1500*number;
            }else{
                price = 900*number;
            }
        }
    }

    public void print() {
        System.out.println(start.name + "\t" + end.name + "\t" + price );
    }





}
