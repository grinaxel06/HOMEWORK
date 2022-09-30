package homework2;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
               int a= in.nextInt();
               int b= 11;
               int c = 2;
               int w= 0;
               for ( int i =1; i < a+1;++i){
                   if (i%2==0){
                       b-=(10*c);
                       w+=(10*c);
                   }
                   else{
                       b*=3;
                   }
                   if (w%70==0){
                       c+=(w/70);
                   }
               }
        System.out.println("Кол-во кроликов"+ b );
        System.out.println("Кол-во волков"+ c );



    }
}
