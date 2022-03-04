package com.xue;

public class ScoringNG {
    public static void main(String[] args) {
        //5 students each english and math
        int [] englishs = {77, 88, 99, 60, 45};
        int [] maths = {55, 100, 60, 98, 75};
        String [] name = {"David", "Ruby", "Frank", "Elsa", "Terry"};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t");
        }
    }
}
