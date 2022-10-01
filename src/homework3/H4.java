package homework3;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int num[ ] = new int [in.nextInt()];
        for (int i=0;i< num.length;i++){
            num[i]= in.nextInt();
        }
        for (int k = 0; k < num.length-1;k++){
            if (num[k]<num[k+1] ){
                System.out.println(num[k+1]);
            }
        }
    }
}
