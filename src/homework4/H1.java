package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m=in.nextInt();
        int [][]A=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=j*i;
            }
        }
    }
}
