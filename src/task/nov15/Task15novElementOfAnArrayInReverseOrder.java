package task.nov15;

import java.util.Scanner;

public class Task15novElementOfAnArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int size =  sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the input for array");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverseElement(arr);
    }
    public static void reverseElement(int arr[]){
        for(int i= arr.length-1; i>=0; i--){

            System.out.print(arr[i]+" ");
        }
    }
}
