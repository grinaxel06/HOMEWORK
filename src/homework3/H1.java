package homework3;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int x= in.nextInt();
                int c=0;
                int b = 1;
                while (n>0){
                   if ( n%10 == x){
                       n /= 10;
                   }
                c += (n%10)*b;
                b *= 10;
                n /=10;

                }
        System.out.println(c);
    }
}
