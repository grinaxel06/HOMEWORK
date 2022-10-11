package homework5;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        int[][] array = new int[n][n];
        for (int y = 0; y < n; y++) {
            array[0][y] = s;
            s++;
        }
        for (int x = 1; x < n; x++) {
            array[x][n - 1] = s;
            s++;
        }
        for (int y = n - 2; y >= 0; y--) {
            array[n - 1][y] = s;
            s++;
        }
        for (int x = n - 2; x > 0; x--) {
            array[x][0] = s;
            s++;
        }
        int c = 1;
        int d = 1;
        while (s < n * n) {
            //право
            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }
            //лево
            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }
            //низ
            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }
            //верх
            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++)
                System.out.print(array[i][j]+" " + "\t");
            System.out.println();
        }
    }
}