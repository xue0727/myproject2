package com.xue.ui;

import kotlin.jvm.internal.MagicApiIntrinsics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    //Fields屬性
    JButton button = new JButton("TRY");
    JLabel label = new JLabel("Goohomework1");
    JLabel label2 = new JLabel("Don't press the button！！");
    //Constructors建構子
    public GuessFrame(){
        super();
        setTitle("Press the button");
        setSize(500,300);
        setLocation(200,100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //System.out.println("Fool!");
                label.setText("Fool！");
            }
        });
        setLayout(new FlowLayout());
        add(label2);
        add(button);
        add(label);
        setVisible(true);
    }






    //Method方法
   /* public void guess(){
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("GUESS THE NUMBER！PLEASE ENTER THE NUMBER");
        }
    Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
    });
    }

    /*@Override
    public void setVisible(boolean b) {
        super.setVisible(true);
    }*/


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
