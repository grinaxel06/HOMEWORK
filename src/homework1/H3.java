package homework1;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hours = 0;
        int minutes = 0;

        if (n >= 60) {
            minutes = n / 60;
            n %= 60;
        }

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes %= 60;
        }
        String minutes1 = Integer.toString(minutes);
        String n1 = Integer.toString(n);


        if (minutes / 10 == 0 ) {
          minutes1 = "0" + minutes;

        }
        if (n/ 10 == 0 ) {
            n1 = "0" + n;
        }
            System.out.println(hours + ":" + minutes1 + ":" + n1);


    }
}
