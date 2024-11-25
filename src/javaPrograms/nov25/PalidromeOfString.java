package javaPrograms.nov25;

import java.util.Scanner;

public class PalidromeOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        //1st approach
        String reverse = "";
        for (int i =str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println(" palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

        //2nd Approach

        boolean is_Palindrome = true;
        int start =0;
        int last = str.length()-1;

        while (last>start){
            if(str.charAt(start) != str.charAt(last)){
                is_Palindrome = false;
            }
            start++;
            last--;
        }
        if (is_Palindrome){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
