package homework1;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        boolean b = true;
        if( a >= -2 && a <= 3 ){
            b = false;
        }
        if( a >= 6 && a <= 9 ){
            b = false;
        }
        System.out.println(b);
        }
}
