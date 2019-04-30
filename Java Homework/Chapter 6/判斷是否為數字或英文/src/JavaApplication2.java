/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    //http://ppy1225.blogspot.tw/2009/06/java_07.html
    
    public static void main(String[] args) {
        // TODO code application logic here
        String pw = "1234abc";//輸入字串7個字園0-6
        boolean hasNumber = false;//設兩個等等要拿來判斷的布林代數 其實用INT代替就好了
        boolean hasLetter = false;
        for (int i = 0; i < pw.length(); i = i + 1) {
            char c = pw.charAt(i);//char c就是PW這個字串裡I位置的字 I=0=1 I=4=a
            int n = c;//把這個數字變成ASCLL碼再變成INT變數
            if (n >= 48 && n <= 57) {
                System.out.println("是數字");
                hasNumber = true;
            } //判斷這個數字是不適再ASCLL碼裡小寫a或是數字的範圍裡
            else if (n >= 97 && n <= 122) {
                System.out.println("是字母");
                hasLetter = true;
            }
        }
        System.out.println(hasNumber && hasLetter);
    }
}

