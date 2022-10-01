package homework3;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 100000;
        int [] M = new int [in.nextInt()];
        for (int i =0; i< M.length;i++){
           M[i]= in.nextInt();
            if(M[i]>0 && M[i]<b){
                b=M[i];
            }
        }
        System.out.println(b);



    }
}
