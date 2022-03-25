package com.xue.score;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name) //constructing
    {
        this.name = name;
    }
    public Student(String name,int english,int math)
    {
        this(name);
        this.english = english;
        this.math = math;
    }
    public Student()
    {

    }
    public void print()
    {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + average() );
        if (average() <60 )
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public int average()
    {
        return (math+english)/2;
    }
}