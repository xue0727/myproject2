package com.xue.score;

public class Scoring {
    public static void main(String[] args) {
        Student Ruby = new Student("Ruby",80,65);
        Ruby.print();
        Student Elsa = new Student("Elsa",76,34);
        Elsa.print();
        GraduteStudent Tony = new GraduteStudent("Tony",60,78,88);
        Tony.print();
    }
}
