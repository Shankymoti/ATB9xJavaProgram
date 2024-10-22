package task.oct22;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Reverse the number using for loop. (In - 12345, Out - 54321)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int reverse=0;
        for(int num = sc.nextInt(); num>0; ){
            int rem = num%10;
            reverse = reverse*10 + rem;
            num =num/10;
        }
        System.out.println(reverse);
    }
}
