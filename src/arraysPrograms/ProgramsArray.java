package arraysPrograms;

import java.util.Scanner;

public class ProgramsArray {

    //23. how do you find first element of given element in a sorted array with using specifc algorithm in java
//Binary Search for first Element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lrngth of array ");

        int range = sc.nextInt();

        int arr[] =  new int[range];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element");
        int target = sc.nextInt();

      int index =  findFirstOccuranceOfTargetElement(arr,target);

      if(index != -1){
          System.out.println(index);
      }else {
          System.out.println(index);
      }


    }
    public static int findFirstOccuranceOfTargetElement(int[] arr, int target){
        int result = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            result =mid;
            end =mid-1;
        } else if (arr[mid] > target) {
            start =mid-1;
            
        }
        else {
            start =mid +1;
        }
        }


        return result;
    }
}
