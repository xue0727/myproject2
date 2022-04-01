package com.xue.ticket;

public class NormalTicket {
    public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;

    Station start;
    Station end;
    int price;


    public  NormalTicket (Station start, Station end){
        this.start = start;
        this.end = end;

        if (start == Station.TAIPEI){
            if (end == Station.TAIPEI){
                System.out.println("error");
            }else if(end == Station.TAICHUNG){
                price = 600;
            }else{
                price =1500;
            }
        }else if (start == Station.TAICHUNG){
            if (end == Station.TAICHUNG){
                System.out.println("error");
            }else if (end == Station.TAIPEI){
                price = 600;
            }else{
                price = 900;
            }
        }else if(start == Station.KAOHSIUNG){
            if (end == Station.KAOHSIUNG){
                System.out.println("error");
            }else if (end == Station.TAIPEI){
                price = 1500;
            }else{
                price = 900;
            }
        }
    }

    public void print() {
        System.out.println(start.name + "\t" + end.name + "\t" + price );
    }





}
