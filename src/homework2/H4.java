package homework2;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int b = 9;
        while (N > 0){
            if (N%10<b && N%10>0){
                b=N%10;
            }
            N/= 10;
        }
        System.out.println(b);
    }
}


