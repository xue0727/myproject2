package com.xue.ticket;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
    NormalTicket normalTicket =
        new NormalTicket(Station.TAIPEI,Station.KAOHSIUNG, 2);
    Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Please enter the startstation (TAIPEI : 100 , TAICHUNG : 200 , KAOHSIUNG : 300)");
       int choice = Integer.parseInt(scanner.next());
       Station startstation = null;
       switch (choice){
           case 100:
               startstation = Station.TAIPEI;
               break;
           case 200:
               startstation = Station.TAICHUNG;
               break;
           case 300:
               startstation = Station.KAOHSIUNG;
               break;
       }
    }
}
