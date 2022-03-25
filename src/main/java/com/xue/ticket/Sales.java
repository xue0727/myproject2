package com.xue.ticket;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
    NormalTicket normalTicket =
        new NormalTicket(Station.TAIPEI,Station.KAOHSIUNG, 2);
    Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Please enter the StartStation (TAIPEI : 100 , TAICHUNG : 200 , KAOHSIUNG : 300)");
       int choice = Integer.parseInt(scanner.next());
       Station stratstation = null;
       switch (choice){
           case 100:

               break;
       }
    }
}
