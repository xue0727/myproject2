package com.xue.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        //檔案名寫錯檔案找不到時的錯誤(FileNotFoundException)
        //處理檔案讀取失敗時的錯誤(IOException)
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            //分行讀取
            String line = reader.readLine();
            while(line!=null){
                //利用逗號分開資料
               String[] token = line.split(",");
               String name = token[0];
               int english = Integer.parseInt(token[1]);
               int math = Integer.parseInt(token[2]);
               Student student = new Student(name,english,math);
               student.print();
               //再讀取下一行(沒有的話會一直重複讀取第一行)
               line = reader.readLine();
            }

           /* int data = fileReader.read();
            while(data!= -1){
                System.out.print((char) data);
                data = fileReader.read();
            }
            System.out.println();*/
        }catch (FileNotFoundException ex){
            System.out.println("檔案讀取錯誤");
        }catch (IOException e){
            System.out.println("資料讀取錯誤");
        }//catch (Exception E)例外處理的父類別
        System.out.println("Testing...");
    }
}
