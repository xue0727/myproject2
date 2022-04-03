package com.xue.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
       /* List<NormalTicket> ticket = new ArrayList<>();
        ticket.add( new NormalTicket(Station.TAIPEI, Station.KAOHSIUNG));
        ticket.add( new StudentTicket(Station.KAOHSIUNG, Station.TAICHUNG));
        for (NormalTicket t:ticket) {
            t.print();
        }*/
        List<NormalTicket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        while(!finish) {
            System.out.println(
                    "Please enter the startstation (TAIPEI : 100 , TAICHUNG : 200 , KAOHSIUNG : 300)");
            int choice = Integer.parseInt(scanner.next());
            Station start = null;
            switch (choice) {
                case 100:
                    start = Station.TAIPEI;
                    break;
                case 200:
                    start = Station.TAICHUNG;
                    break;
                case 300:
                    start = Station.KAOHSIUNG;
                    break;
                case 0:
                    System.out.println("Cancel order");
                    finish = true;
                    break;
                default:
                    System.out.println("error!");
                    break;
            }
            System.out.println(
                    "Please enter the endstation (TAIPEI : 100 , TAICHUNG : 200 , KAOHSIUNG : 300)");
            int choice1 = Integer.parseInt(scanner.next());
            Station end = null;
            switch (choice1) {
                case 100:
                    end = Station.TAIPEI;
                    break;
                case 200:
                    end = Station.TAICHUNG;
                    break;
                case 300:
                    end = Station.KAOHSIUNG;
                    break;
                case 0:
                    System.out.println("Cancel order");
                    finish = true;
                    break;
                default:
                    System.out.println("error!");
                    break;
            }

            System.out.println(
                    "Please choose the ticket you want (normal：100, student：200, older：300)");
            int choice2 = Integer.parseInt(scanner.next());
            NormalTicket ticket = null;
            switch (choice2) {
                case 100:
                    ticket = new NormalTicket(start, end);
                    tickets.add(new NormalTicket(start, end));
                    break;
                case 200:
                    ticket = new StudentTicket(start, end);
                    tickets.add(new StudentTicket(start, end));
                    break;
                case 300:
                    ticket= new OlderTicket(start, end);
                    tickets.add(new OlderTicket(start, end));
                    break;
                case 0:
                    System.out.println("Cancel order");
                    finish = true;
                    break;
                default:
                    System.out.println("error!");
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
                    break;
            }

        }

        }
    }
