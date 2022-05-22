package com.xue.parking;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {
        /*String id = "ABC-1234";
        String enterTime = "11:55";
        String exitTime = "14:03";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");

        Money money = new Money("ABC-1234","11:09", "12:10");
        money.print();

        List<Money> M = new ArrayList<>();
        M.add(new Money("ABC-1234","11:43","12:55"));
        M.add(new Money("DFV-1266","01:22","08:32"));
        M.add(new Money("KJJ-8374","17:33","20:13"));

        for (Money m:M) {
            m.print();
        }*/

        //輸入車牌號，得到收費表
        Money money = new Money("ABC-1234","11:09", "12:10");
        System.out.println(money.id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = Integer.parseInt(scanner.next());
        try {
            Integer.parseInt(money.id);
        if (number == Integer.parseInt(money.id)){
            money.print();
        }else {
            System.out.println("ERROR");
        }
        }catch (NumberFormatException E){
            System.out.println("error");
        }

    }
    }

