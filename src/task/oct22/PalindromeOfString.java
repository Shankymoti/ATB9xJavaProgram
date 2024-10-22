package task.oct22;

import java.util.Scanner;
//Palidrome of String (chatAt())
public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        // First approach
        boolean is_palindrome = true;
        int start =0;
        int last = str.length()-1;
        while (last>start){
           if(str.charAt(start) != str.charAt(last)){
               is_palindrome =false;
           }
            start++;
            last--;

        }
        if(is_palindrome){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not a palindrome");
        }

        //Second Approach

     /*   String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is  not palindrome");
        }

      */
    }
}
