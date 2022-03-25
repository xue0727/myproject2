package com.xue.score;

public class GraduteStudent extends Student {
    int thesis;
    public GraduteStudent(String name,int english,int math,int thesis)
    {
        super(name, english, math);
        this.thesis = thesis;

    }
    public GraduteStudent(String name)
    {
        super(name);
        //this.name = name;
    }
    @Override
    public void print()
    {
        System.out.println(name + "\t"+english+"\t" +math + "\t" +
                           average() + "\t" + thesis);
    }
}
