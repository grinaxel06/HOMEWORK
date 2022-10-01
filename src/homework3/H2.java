package homework3;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 0;
        int c =1;
        while (n >0){
            b+= (n%10);
            b *= 10;
            n/=10;
        }
        System.out.println(b/10);
    }
}
