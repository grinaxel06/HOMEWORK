package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=0;
        int [][] A =new int[n][n] ;
        int j_max = n-1;
        int i_max = n-1;
        for (int i=0;i<n;i++){
            for(int j=0;i<n;j++){
                if (i==0) {
                    A[i][j] = c;
                    c++;
                }
                if(j_max==j){
                    A[i][j] = c;
                    c++;


                }
                if (i_max ==i){
                    A[i][j] = c;
                    c++;

                }


            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j]+"  " + "\t");
            System.out.println();
        }

    }
}
