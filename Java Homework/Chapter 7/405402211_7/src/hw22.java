
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class hw22 {

    public static void main(String[] args) {
        int[][] Q = new int[8][2];
        for (int i2 = 0; i2 < 8; i2++) {
            Q[i2][0] = i2 + 1;
        }

        List<Integer> y = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            y.add(i);
        }
        for (int i3 = 0; i3 < 8; i3++) {
            Q[i3][1] = y.get(i3);
        }
        int k = 0;
        while (k == 0) {  //隨機產生在Y軸上不重複的皇后
            Collections.shuffle(y);
            for (int i3 = 0; i3 < 8; i3++) {
                Q[i3][1] = y.get(i3);
            }
            if (crash(Q) == true) {
                k += 1;
            }
        }

        for (int i4 = 0; i4 < 8; i4++) {
            for (int i5 = 0; i5 < Q[i4][1] - 1; i5++) {
                System.out.printf("| ");
            }

            System.out.printf("|Q|");

            for (int i6 = 0; i6 < 8 - Q[i4][1]; i6++) {
                System.out.printf(" |");
            }
            System.out.printf("\n");
        }
    }

    public static boolean crash(int[][] A) { //判斷是否在移動路徑上會有其他皇后
        int flag = 0;
        for (int x = 0; x < 8; x++) {
            for (int i = 1; i < 8; i++) {
                int[] tag1 = {A[x][0], A[x][1]};
                int[] tag2 = {A[x][0], A[x][1]};
                int[] tag3 = {A[x][0], A[x][1]};
                int[] tag4 = {A[x][0], A[x][1]};

                tag1[0] += i;
                tag1[1] += i;

                tag2[0] -= i;
                tag2[1] -= i;

                tag3[0] += i;
                tag3[1] -= i;

                tag4[0] -= i;
                tag4[1] += i;

                for (int i2 = x + 1; i2 < 8; i2++) {
                    if (tag1[0] == A[i2][0] && tag1[1] == A[i2][1]) {
                        flag += 1;
                    }
                    if (tag2[0] == A[i2][0] && tag2[1] == A[i2][1]) {
                        flag += 1;
                    }
                    if (tag3[0] == A[i2][0] && tag3[1] == A[i2][1]) {
                        flag += 1;
                    }
                    if (tag4[0] == A[i2][0] && tag4[1] == A[i2][1]) {
                        flag += 1;
                    }
                }

            }
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }

}
