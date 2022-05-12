package com.xue.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sales2 {
    public static void main(String[] args) {
       /* List<NormalTicket> ticket = new ArrayList<>();
        ticket.add( new NormalTicket(Station.TAIPEI, Station.KAOHSIUNG));
        ticket.add( new StudentTicket(Station.KAOHSIUNG, Station.TAICHUNG));
        for (NormalTicket t:ticket) {
            t.print();
        }*/
        List<NormalTicket> tickets = new ArrayList<>();
        //List<Sum> sums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        while (!finish){
            System.out.println(
                    "Please enter the startstation (TAIPEI : 1 , TAICHUNG : 2 , KAOHSIUNG : 3)");
            int choice = Integer.parseInt(scanner.next());
            Station start = null;
            switch (choice) {
                case 1:
                    start = Station.TAIPEI;
                    break;
                case 2:
                    start = Station.TAICHUNG;
                    break;
                case 3:
                    start = Station.KAOHSIUNG;
                    break;
                case 0:
                    System.out.println("Cancel order");
                    System.exit(0);
                    break;
                default:
                    System.out.println("error!");
                    System.exit(0);
                    break;
            }
            System.out.println(
                    "Please enter the endstation (TAIPEI : 1 , TAICHUNG : 2 , KAOHSIUNG : 3)");
            int choice1 = Integer.parseInt(scanner.next());
            Station end = null;
            switch (choice1) {
                case 1:
                    end = Station.TAIPEI;
                    break;
                case 2:
                    end = Station.TAICHUNG;
                    break;
                case 3:
                    end = Station.KAOHSIUNG;
                    break;
                case 0:
                    System.out.println("Cancel order");
                    System.exit(0);
                    break;
                default:
                    System.out.println("error!");
                    System.exit(0);
                    break;
            }

            System.out.println("please enter the number");
            int number = Integer.parseInt(scanner.next());

            System.out.println(
                    "Please choose the ticket you want (normal：1, student：2, older：3)");
            int choice2 = Integer.parseInt(scanner.next());
            NormalTicket ticket = null;
            NormalTicket price = null;
            switch (choice2) {
                case 1:
                    ticket = new NormalTicket(start, end, number);
                    tickets.add(new NormalTicket(start, end, number));
                    break;
                case 2:
                    ticket = new StudentTicket(start, end, number);
                    tickets.add(new StudentTicket(start, end, number));
                    break;
                case 3:
                    ticket= new OlderTicket(start, end, number);
                    tickets.add(new OlderTicket(start, end, number));
                    break;
                case 0:
                    System.out.println("Cancel order");
                    System.exit(0);
                    break;
                default:
                    System.out.println("error!");
                    System.exit(0);
                    break;
            }

            System.out.println(
                    "If you want to order other tickets, please enter 1 " +
                            ", print the receipt, please enter 2" +
                            ", cancel the order, please enter 0");
            int choice3 = Integer.parseInt(scanner.next());
            switch (choice3) {
                case 0:
                    System.out.println("Cancel order");
                    finish = true;
                    break;
                case 1:
                    System.out.println("order other tickets");
                    break;
                case 2:
                    for (NormalTicket t:tickets) {
                        t.print();
                    }

                    finish = true;
                    break;
                default:
                    System.out.println("error!");
                    finish = true;
                    break;
            }

        }

        }
    }
