package homework3;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = -1;
        int [] M = new int [in.nextInt()];
        for (int i =0; i< M.length;i++){
           M[i]= in.nextInt();
            if(M[i]>0 && M[i]<min || min < 0){
                min=M[i];
            }
        }
        System.out.println(min);



    }
}
