package task.oct29;

import java.util.Scanner;

public class BinarySearchByUsingLoop {
    public static void main(String[] args) {
        //Binary search is an efficient algorithm for finding a specific value within a sorted array or list.
        // It works by repeatedly dividing the search interval in half.
        // if the value of the search key is less than the item in the middle of the interval,
        // the search continues in the lower half; otherwise, it continues in the upper half.
        // This process is repeated until the value is found or the interval is empty.

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //take input from user
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int  target =  sc.nextInt();
       int resultIndex = binarySearchByUingLoop(arr, target);
        System.out.println(resultIndex);
    }
  public static int binarySearchByUingLoop(int[] arr, int target){
        int start = 0;
        int last = arr.length-1;

        while(start <last){
            int mid = start + (last-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                last = mid-1; // move left
                
            }else {
                start = mid +1; // move right
            }
        }
        return -1; // not found

  }
}
