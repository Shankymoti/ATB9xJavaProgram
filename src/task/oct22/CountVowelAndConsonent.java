package task.oct22;

import java.util.Arrays;
import java.util.Scanner;
//Count vowels and consonants in a String.
public class CountVowelAndConsonent {
    //first approach with toCharArray
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str = sc.nextLine();
//        str = str.toLowerCase();
//        System.out.println(str);
//        char ch[] = str.toCharArray();
//        int vowel =0;
//        int consonent =0;
//        for (int i = 0; i <ch.length ; i++) {
//            System.out.println(ch[i]);
//            if (ch[i]=='a' || ch[i] == 'e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u'){
//                vowel++;
//            }else if(ch[i] == ' ') {
//         // print count of space if required
//            }else {
//                consonent++;
//            }
//
//        }
//        System.out.println("vowel count is : "+vowel);
//        System.out.println("consonent count is : "+consonent);
//    }

        //Second approach with String function ie. charAt()
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
    String str = sc.nextLine().toLowerCase();
    int v =0, c=0;
    for(int i=0; i<str.length();i++)
    {
        char ch = str.charAt(i);
        if (ch =='a' || ch == 'e' ||  ch =='i' || ch =='o' || ch =='u'){
            v++;
        }else if(ch>='a'&& ch<='z') {
            c++;
        }else {
            // we can also print the count of space
        }
    }
        System.out.println("vowel is"+v);
        System.out.println("consonent is"+c);
    }

}
