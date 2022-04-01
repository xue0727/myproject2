package com.xue;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add("abc");
        list.add('k');
        list.add(true);
        System.out.println(list.size());
        System.out.println(list);
        int n1 = (int)list.get(0);
        char n2 = (char)list.get(3);
        boolean n3 = (boolean)list.get(4);
        System.out.println(n3);
        List<String> lists = new ArrayList();
        lists.add("KKKKKKK");
        lists.add("HAHAHA");
        System.out.println(lists);
    }
}
