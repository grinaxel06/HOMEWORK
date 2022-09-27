package homework1;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        int c3 = in.nextInt();
        int n = 0;
        boolean c = false;
        if ( c1%5==0 && c1/100 > 0){
            n ++;
        }
        if ( c2%5==0 && c2/100 > 0){
            n++;
        }
        if ( c3%5==0 && c3/100 > 0){
            n++;
        }
        if ( n >=2){
            c = true;
        }
        System.out.println(c);
    }
}
