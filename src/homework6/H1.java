package homework6;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        byte[] a = new byte[n];
        for (int i =0; i<n;i++){
            boolean bool=in.nextBoolean();
            if (bool){
                a[i]=1;
            }
            else{
                a[i]=0;
            }

        }
        for(int i =0;i<n;i++){
            if ( a[i]==1){
                System.out.println(true + " ");
            }
            else {
                System.out.println(false + " ");
            }
        }
    }
}
