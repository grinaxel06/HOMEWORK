package homework4;

import java.util.Scanner;

public class MyArrays {
    public static int MinToBegin (int N){
        int arr[] = new int[N];

        Scanner in = new Scanner(System.in);
        for (int i =0; i<arr.length-1;i++){
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        for (int i = 0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }


        return arr[N];
    }
    public static double avgOf4Digit(int N){
        Scanner in = new Scanner(System.in);
        double sum=0;
        double cot = 0;
        int M[] = new int[N];
        for(int i =0; i< N;i++){
            M[i]= in.nextInt();
            if (M[i]>0 && M[i]/1000>0 && M[i]/1000<10){
                sum+=M[i];
                cot++;
            }


        }
        if (sum>0) {
            return sum = sum / cot;
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        System.out.println(avgOf4Digit(N));

    }
}
