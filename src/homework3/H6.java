package homework3;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a;
        int b;
            a = in.nextInt();
            b = in.nextInt();
            for (int i = 0 ;i< N-2;i++) {
                if (a < b) {
                    System.out.println(b);
                }
                a=b;
                b = in.nextInt();
            }



    }
}
