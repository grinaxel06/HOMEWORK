package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c =0;
        int[][] A = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2==0) {
                    A[i][j] = c++;
                }
                else{
                    A[i][j] = c--;

                }



            }
            c+=m;
            if(i%2==0) {
                c--;
            }
            else{
              c++;

            }

        }
        System.out.println(Arrays.deepToString(A));
    }
}
