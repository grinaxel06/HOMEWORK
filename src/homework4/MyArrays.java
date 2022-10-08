package homework4;

import java.util.Scanner;

public class MyArrays {
    public static int[] MinToBegin (int[] M){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = M;
        int c = 0;


        for (int i =0; i<arr.length-1;i++){
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        for (int i = 0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
                c=i;

            }
        }
        for (int i =c ;i>0;i--){
            arr[i]=arr[i-1];


        }
        arr[0]=min;
        return arr;


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
        int M[]= new int[N];
        for(int i = 0; N>i;i++){
            M[i]= in.nextInt();
        }

        System.out.println(avgOf4Digit(N));
        System.out.println(MinToBegin(M));


    }


}
