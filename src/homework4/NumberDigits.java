package homework4;

import java.util.Scanner;

public class NumberDigits {
    public static int sumOfSeven(int a,int b){
        int sum=0;
        for ( int i=a ; i<b ; i++){
            int c=i;
            if (c/100 ==0 && c/10 >=1 && c%7==0){
                sum+=c%10;
                c/=10;
                sum+=c%10;

            }

        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumOfSeven(a,b));

    }

}
