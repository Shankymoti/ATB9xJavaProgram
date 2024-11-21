package task.nov20;

import java.util.Scanner;

public class Task20Nov_Reverse_Element_Of_Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        Integer arr[] = new Integer[size];
        System.out.println("Enter input element for an array");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reverseArrayElement(arr);
    }

    public static void reverseArrayElement(Integer arr[]){
        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
