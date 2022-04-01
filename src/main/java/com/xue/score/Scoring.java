package com.xue.score;

import com.xue.sales.customer;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ruby",80,65));
        students.add(new Student("Elsa",76,34));
        students.add(new GraduteStudent("Tony",60,78,88));

        for (Student s:students) {
            s.print();
        }
    }
}
