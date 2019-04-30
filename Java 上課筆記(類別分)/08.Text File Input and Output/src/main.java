
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        //Texy File Input and Output
        //中文檔比較複雜
        final int STUDENT_NO = 100;//最多100個學生
        final int SUBJUCT_NO = 3;//每個學生有三個成績
        //二維陣列(資料表的概念)
        //final(修飾詞，有點像形容詞、副詞這類的)
        //一旦被宣告為final則永遠不能改，就像Pyhton中的__

        String[] name = new String[STUDENT_NO];
        int[][]/*幾為陣列就幾個方括號*/ score = new int[STUDENT_NO][SUBJUCT_NO];
        int[] total = new int[STUDENT_NO];
        double[] average = new double[STUDENT_NO];

        int n = 0;//學生數(初設為零)current student no.
        String fn;//fn => file name
        File file;//File => Java中對付檔案的標準辦法

        //Input
        fn = "data.txt";
        file = new File(fn);/*除了那八種基本型態外，其他都要new，形成一個檔案物件*/

        try (Scanner input = new Scanner(file)) {
            //因為try catch不好寫，所以可使用電腦自己來寫(點旁邊的fix)
            //然後來改try catch的範圍
            //try catch這種檔案輸入輸出規定寫法，就讓機器寫
            //try => 試試看，有可能會有錯誤
            //Scanner資料
            //鍵盤是標準輸入檔Scanner(System.in)
            //銀幕是標準輸出檔
            //銀幕一般而言也是標準錯誤檔
            //Scanner(file)是從file去抓
            while ((n < STUDENT_NO) && input.hasNext()) {
                name[n] = input.nextLine();
                String[] s = input.nextLine().split(" ");
                //因為有多個成績，所以使用NextLine()，得到一個字串陣列
                for (int i = 0; i < SUBJUCT_NO; i++) {
                    score[n][i] = Integer.valueOf(s[i]);
                    //從字串轉成整數
                }
                n++;
                //n是學生人數
            }
        } catch (FileNotFoundException ex) {
            //如果有錯誤，catch會把他抓起來，如果沒有try、catch，可是發生狀況，整個系統就會掛掉
            //各式各樣可預期的問題，應該try ,catch包起來
            //在Java中，只要輸入資料就一定要用try catch包起來

            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(Arrays.toString(name));
        //如果要測試，就打上面那行
        //因為現在是輸入資料，所以沒有顯示任何結果是正常的

        //Processing
        for (int i = 0; i < n; i++) {
            total[i] = 0;
            for (int j = 0; j < SUBJUCT_NO; j++) {
                total[i] += score[i][j];
            }
            average[i] = (double)/*把總分先轉成浮點數，避免像攝氏轉華氏這種問題*/ total[i] / SUBJUCT_NO;
            System.out.println("name = [" + name[i] + "]");
            System.out.println("total = " + total[i]);
            System.out.println("average = " + average[i]);
        }

        //Output
        fn = "output.txt";
        file = new File(fn);
        try (PrintWriter output = new PrintWriter(file)) {
            //PrintWriter 是Java的輸出工具
            for (int i = 0; i < n; i++) {
                output.println("name = [" + name[i] + "]");
                output.println("total = " + total[i]);
                output.println("average = " + average[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
