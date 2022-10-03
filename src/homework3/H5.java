package homework3;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a;
        int min= 100000;
        int N = in.nextInt();
        for (int i =0; i<N;i++){
            a= in.nextInt();
            if (a>0 && a<min){
                min=a;
            }
        }
        System.out.println(min);
    }
}
