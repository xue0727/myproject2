package com.xue.sales;
//實作 MyInterface 介面
public class MyClass implements MyInterface{
    @Override
    public void print() {
        System.out.println("Print Me!!");
    }

    @Override
    public int max(int a, int b) {
        a = 100;
        b = 400;
        return a+b;
    }

    @Override
    public void Hello() {
        System.out.println("Hello!");
    }
}
