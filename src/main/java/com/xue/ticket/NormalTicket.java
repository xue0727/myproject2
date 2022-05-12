package com.xue.ticket;

public class NormalTicket {
    /*public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;*/

    Station start;
    Station end;
    int price;
    int number;
    int money;
    int sum  ;


    public  NormalTicket (Station start, Station end, int number){
        this.start = start;
        this.end = end;
        this.number = number;

        money = Math.abs(start.id-end.id);
        switch (money){
            case 100:
                price = 500*number;
                break;
            case 200:
                price = 600*number;
                break;
            case 300:
                price = 1100*number;
                break;
            default:
                System.out.println("ERROR");
                System.exit(0);
                break;
        }
        sum = sum + price;


        /*if (start == Station.TAIPEI){
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
        }*/
    }


    public void print() {
        System.out.println(start.name + "\t" + end.name + "\t" + price );

    }
    public void Sum() {
        System.out.println(sum);
}





}
