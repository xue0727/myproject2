package com.xue.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //swing,JavaFX(eXtension)
        JFrame frame = new JFrame();

        //設定如何結束程式
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //設定視窗大小
        frame.setSize(400,250);
        frame.setLocation(300,150);
        //frame.setBounds(250,150,450,300);

        //做一個按鈕，設定大小
        JButton button = new JButton("TRY");
        //匿名類別 Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Fool!");
            }
        });
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("Testing"));

        //設定是否開啟視窗
        frame.setVisible(true);

    }
}
