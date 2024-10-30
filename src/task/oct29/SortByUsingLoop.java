package task.oct29;

import java.util.Arrays;
import java.util.Scanner;

public class SortByUsingLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //take input from user
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter "+i+" element");
            arr[i] = sc.nextInt();
        }

        sortArrayByUsingLoop(arr);
      // System.out.println(Arrays.toString(arr));
 for(int a : arr){
     System.out.println(a);
 }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortArrayByUsingLoop(int[] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp =arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
