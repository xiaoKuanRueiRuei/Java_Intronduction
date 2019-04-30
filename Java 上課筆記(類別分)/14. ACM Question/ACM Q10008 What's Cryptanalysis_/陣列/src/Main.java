
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ACM Q10008 What's Cryptanalysis?
        int[] a = new int[26];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        //將26個整數陣列初值設為零

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int k = Integer.valueOf(s);
        for (int j = 0; j < k; j++) {
            s = input.nextLine().toUpperCase();
            f(s, a);
        }

        int[] b = Arrays.copyOf(a, a.length);
        //陣列拷貝，陣列不得隨意排序，會亂掉，所以先拷貝一份作為備份
        //如此才能知道原本對應關係
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        /*
        這是要找出出現頻率的順序
        run:
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5, 7]
        */
        System.out.println(Arrays.toString(b));
        /*
        這是要找出出現頻率對應的字母
        遇到相同頻率時，我們就依照先出現的位置寫(例如A跟H都是2，所以先出現2對應到A)
        run:
        [2, 0, 1, 0, 4, 0, 0, 2, 5, 0, 0, 0, 1, 2, 3, 0, 1, 0, 7, 5, 2, 0, 2, 0, 2, 0]
        */
        
        for (int i = a.length - 1; i >= 0; i--) {
            //因為是倒數，所以是i--
            int count = a[i];
            if (count > 0) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == count) {
                        b[j] = 0;
                        //如果找到了，就將其次數改成零，如此下次就不會再找到他了
                        System.out.println((char) (j + 'A') + " " + count);
                        break;
                    }
                }
            }
        }
    }

    static void f(String s, int[] a) {
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if ('A' <= x && x <= 'Z') {
                int y = x - 'A';
                a[y]++;
            }
        }
    }
}
/*
3
This is a test.
Count me 1 2 3 4 5.
Wow!!! Is yhis question easy?
*/

/*
S 7
I 5
T 5
E 4
O 3
A 2
H 2
N 2
U 2
W 2
Y 2
C 1
M 1
Q 1
*/
