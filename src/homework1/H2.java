package homework1;

import java.util.Scanner;

public class H2 {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                a = a*n;
                b = b*n;
                if (b >= 100){
                    a = a + b / 100;
                    b %= 100;
                }
        System.out.println(a + " " + b);





    }
}
