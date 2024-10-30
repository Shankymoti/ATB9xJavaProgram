package task.oct29;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayPredefinedMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //Take input from user
        for (int i=0; i<arr.length;i++){
            System.out.println("Enter "+i+" element");
            arr[i] =sc.nextInt();
        }
        sortArray(arr);
        // Print the array
        //First Approach
        System.out.println(Arrays.toString(arr));
        //Second Approach
        for(int a : arr){
            System.out.println(a);
        }
        //Third Approach
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortArray(int[] arr){
        Arrays.sort(arr);// it is sort the array in ascending order
        return arr;
    }
}
