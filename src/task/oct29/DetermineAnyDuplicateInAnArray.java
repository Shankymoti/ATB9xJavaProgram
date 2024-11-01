package task.oct29;

import  java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class DetermineAnyDuplicateInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        findDuplicateInArray(arr);
    }

    public static  void findDuplicateInArray(int[] arr){

       // First Approach
        Set<Integer> set = new HashSet<Integer>();
        for(int a : arr){
            if(set.add(a) == false){
                System.out.println("duplicate element is: "+a);
            }
        }

        // Second Approach -  by brute force

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" is duplicate element");
                }
            }
        }
    }
}
