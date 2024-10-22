package task.oct22;

import java.util.Arrays;
import java.util.Scanner;
//Count vowels and consonants in a String.
public class CountVowelAndConsonent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
        char ch[] = str.toCharArray();
        int vowel =0;
        int consonent =0;
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
            if (ch[i]=='a' || ch[i] == 'e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u'){
                vowel++;
            }else if(ch[i] == ' ') {

            }else {
                consonent++;
            }

        }
        System.out.println("vowel count is : "+vowel);
        System.out.println("consonent count is : "+consonent);
    }
}
