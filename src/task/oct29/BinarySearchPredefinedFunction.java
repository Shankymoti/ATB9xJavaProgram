package task.oct29;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchPredefinedFunction {
    //Binary search is an efficient algorithm for finding a specific value within a sorted array or list.
    // It works by repeatedly dividing the search interval in half.
    // if the value of the search key is less than the item in the middle of the interval,
    // the search continues in the lower half; otherwise, it continues in the upper half.
    // This process is repeated until the value is found or the interval is empty.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i =0; i<arr.length; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int resultIndex = binarySearchByUsingInbuiltFunction(arr,target);
        System.out.println(resultIndex);
    }
    public  static int binarySearchByUsingInbuiltFunction(int[] arr, int target){
        return Arrays.binarySearch(arr, target);// it return index if not then -1

    }
}
