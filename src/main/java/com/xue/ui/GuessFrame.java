package com.xue.ui;

import kotlin.jvm.internal.MagicApiIntrinsics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    //Fields屬性
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("START");
    //JLabel label2 = new JLabel("Don't press the button！！");
    JTextField number = new JTextField(10);

    //Constructors建構子
    public GuessFrame(){
        super();
        setTitle("Guess the number 1-10");
        setSize(500,300);
        setLocation(200,100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //System.out.println("Fool!");
                //label.setText("Fool！");
                int num = Integer.parseInt(number.getText());
                //System.out.println(num);
                if (num > secret){
                    label.setText("Smaller");
                }else if(num < secret){
                    label.setText("Bigger");
                }else{
                    label.setText("BINGO！The secret number is " + secret);
                }
            }
        });
        setLayout(new FlowLayout());
        //add(label2);
        add(number);
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
