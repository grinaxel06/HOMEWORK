package homework1;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int b = 0;
        int sum = 0;
        b = num - num % 2 + 2;
        sum += num % 10;
        num = num / 10;
        sum += num % 10;
        num = num / 10;
        sum += num;
        System.out.println(sum + " " + b);

    }
}
