package task.nov15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskNov15FrequencyOfEachElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an  Array");
        int size =  sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Take input from user");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map =  new HashMap<>();

        for(int m : arr){
         if(map.containsKey(m)){
             map.put(m, map.get(m)+1);
         }else {
             map.put(m,1);
         }
        }
        System.out.println(map);
    }
}
