/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*public是讓所有程式可以來找找看，看主程式是否有指令*/
        /*static讓大家不用new*/
        // TODO code application logic here
//體會物件導向對於寫程式上的幫助
        //陣列(舊寫法)
        /*一片森林裡看到一千棵樹的邏輯*/
        /*
         final int STUDENT_NO = 100;
         final int SUBJECT_NO = 3;
        
         String[]name = new String[STUDENT_NO];
         int[][]score = new int[STUDENT_NO][SUBJECT_NO];
         int[]total = new int[SUBJECT_NO];
         double[]average = new double[STUDENT_NO];
        
         int n = 0;
         String fn;
         File file;
         */
        //Stream
        /*陣列的缺點是範圍不能更動，但是串列沒有限制，亦可說沒有上限*/
        /*一片森林裡看到一片森林的邏輯*/

        /*如果Score class第21行沒有寫static，就要加上下列程式*/
        /*
         String name = "hello";
         int[] score = {90, 97, 75};
         Score x = new Score(name, score);
         System.out.println(x.SUBJECT_NO);
         */
        /*
         System.out.println(Score.SUBJECT_NO);
         */
        /*
         run:
         3
         */
        /*此程式可證明出類別原本是屬於一個藍圖，
         必須建立一個物件(要new出來)，是因為static的關係*/
        List<Score> list = Score.readFile("data.txt");
        /*< >這是通用型的符號(亦有其他表達方式)*/
        for (Score x : list) {
            System.out.println(x);
        }
        /*for-each寫法*/
        Score.writeFile("output.txt", list);
    }
    /*
     run:
     Score{name=Ricky, score=[98, 87, 91]}
     Score{name=Mike, score=[98, 96, 52]}
     Score{name=Cindy, score=[60, 52, 95]}
     Score{name=May, score=[23, 56, 89]}
     Score{name=Ray, score=[56, 59, 45]}
     */

}
