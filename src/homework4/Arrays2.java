package homework4;

import java.util.Scanner;

public class Arrays2 {
    public static int MinToBegin (int z){
        int arr[] = new int[z];

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


    return arr[z];
    }

    public static void main(String[] args) {

    }
}
