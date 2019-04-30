/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Score {

    /*Nvidia CEO: Software is eating the world , 
     but AI is going to eat software.*/
    private String name;
    private int[] score;
    private int total;
    private double average;
    private static final int SUBJECT_NO = 3;
    /*SUBJECT_NO = 3，總共三個科目*/
    /*static : 有的資料是屬於大家常享的，為了用起來更方便，
     不用new即可使用，則我們可以將其宣告為靜態(static)，則可以辦到。
     靜態變數亦可稱為類別變數，
     因為宣告靜態後則此物件將不再屬於任何一個人的物件了，
     而是屬於整體類別的(此物件在整個類別中只有一個東西)
     好處：
     1. 主程式無須new
     2. 此資料屬於公有財，整個系統都可使用
     (相似用法有pi的物件，Math.pi，因為pi在Math類別中被定義為static)*/

    /*如果想要讓外來計算機可以進入主電腦更改資料則開放set，
     (不能透過set，則可以讓外部計算機使用建構子鍵入資料)
     若只願意開放取得則封裝get*/
    //建構子(total , average並不是外部資料給的，所以在產生程式時，不要勾選此二項)
    public Score(String name, int[] score) {
        this.name = name;
        this.score = score;
        total = Arrays.stream(score).sum();
        average = (double) total / SUBJECT_NO;
    }
    /*為何要加this?
     為了讓計算機知道我在說哪個name和score，
     而total和average沒有重複，所以可加(this)可不加*/

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the score
     */
    public int[] getScore() {
        return score;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Score{" + "name=" + name + ", score=" + Arrays.toString(score) + '}';
    }

    public static List<Score> readFile(String fn) {
        File file = new File(fn);
        List<Score> list = new ArrayList<>();
        /*List是抽象類別
         故要new一個實體類別(ArrayList)*/

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String name = input.nextLine();
                /*從檔案輸入整合最簡單就是nextLine()*/
                int[] score = new int[SUBJECT_NO];
                /*先宣告*/
                String[] s = input.nextLine().split(" ");
                /*將資料讀進來(中間用" "(空白)隔開)後，
                 自動放入一個字串陣列中(String[] s)*/
                for (int i = 0; i < SUBJECT_NO; i++) {
                    score[i] = Integer.valueOf(s[i]);
                }
                /*純粹將字串轉為數字*/
                list.add(new Score(name, score));
                /*利用建構子產生一個成績的物件，並且加入成績串列中。
                 串列的用法辨識加在園串列的尾端，並且沒有長度限制*/
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void writeFile(String fn, List<Score> list) {
        File file = new File(fn);
        try (PrintWriter output = new PrintWriter(file)) {
            /*PrintWriter(套件)將其輸出*/
            for (Score x : list) {
                /*將每一個學生的資料讀出並且依照下述要求一一取出*/
                output.println("name = [" + x.getName() + "]");
                /*[]只是為了確認有沒有多印出空白*/
                output.println("total = " + x.getTotal());
                output.format("average = %.2f\n", x.getAverage());
                output.println();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
/*物件導向L9(非常重要，期末考一定會考)的作業：1,2,7,8*/
