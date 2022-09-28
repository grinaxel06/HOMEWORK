package homework1;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if (y <= - x*x && (y >= 0 || y >= x )){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
