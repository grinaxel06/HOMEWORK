package homework2;

import java.util.Scanner;

public class H1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int b = 1;
        int sum=0;
        int c = 1;
        for (int i = 0; i < N; i++) {

          sum=c+b;
          c=b;
          b=sum;






        }
        System.out.println(b);
    }
}
