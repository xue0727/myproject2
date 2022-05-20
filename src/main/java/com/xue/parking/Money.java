package com.xue.parking;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Money {
    String id;
    int price;
    String enterTime;
    String exitTime;



    public Money(String id, String enterTime, String exitTime){
        this.id = id;
        this.enterTime = enterTime;
        this.exitTime = exitTime;

        Date date = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");

        try{
            Date d1 = sdf.parse(enterTime);
            Date d2 = sdf.parse(exitTime);
            long ms = d2.getTime() - d1.getTime();
            int minutes = (int)(ms/(1000*60));
            if (minutes <= 15){
                //不滿15分鐘不算錢
                price = 0;
            }else if (minutes>15 && minutes<45 ) {
                //15-29分鐘算為半小時，收15元
                //30-44分鐘算為半小時，收15元
                price = 15;
            }else{
                //1小時30元
                int hours = minutes / 60;
                price = hours * 30;
            }
        }catch (Exception e){
            System.out.println("Wrong format");
        }
        //繳費完成後15分鐘內需離場

    }
    public void print(){
        System.out.println(
                "ID: " + id + "\n"+
                "Enter Time: " + enterTime + "\n"+
                "Exit Time: "+ exitTime + "\n" +
                "The total price is " + price + " dollars");
        System.out.println();
    }


}
