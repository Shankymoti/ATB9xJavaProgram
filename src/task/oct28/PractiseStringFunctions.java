package task.oct28;

public class PractiseStringFunctions {
    public static void main(String[] args) {


       //length()

        String str = "Shahsank Kumar";
        int size = str.length();
        System.out.println(size);

        //equals()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //equalsIgnoreCase()

        boolean flag = s1.equalsIgnoreCase(s3);
        System.out.println(flag);

        System.out.println(s1.equalsIgnoreCase(s3));;

        // toLowerCase()
        String s4 = "Welcome TO India";
        System.out.println(s4.toLowerCase());

        //toUpperCase()
        s4 = s4.toUpperCase();
        System.out.println(s4);

        //charAt()

        String s5 = "Shashank1012";
        char ch = s5.charAt(2);
        System.out.println(ch);
       // char ch2 = s5.charAt(-1);
      //  System.out.println(s5.charAt(30));

        //subString()
        //           0123456789
        String s6 = "Welcome to Testing Academy";
        System.out.println(s6.substring(8));
        String s7 = s6.substring(0,9);
        System.out.println(s7);

        // == vs equals
        String s8 = "hello";
        String s9 = "hello";
        String s10 = "Hello";

        String s11= new String("hello");

        System.out.println(s8 == s9);
        System.out.println(s8 == s10);
        System.out.println(s8 == s11); // checks if 2 string reference points  to same memory

        System.out.println(s8.equals(s11)); // comparing contents of 2 strings
        System.out.println(s8.equals(s9));

        //replace()
        String s12 = "Hello";
        System.out.println(s12.replace('l','w'));//Hewwo

        String original = "Hello123 World123@";
        String result = original.replace("Hello", "Bye");
        System.out.println(result);
        //replaceAll()
        String result2 = original.replaceAll("\\d+","");
        System.out.println(result2);

        //concat()

        String s13 = "Hello";
        String s14 = "World";
        String s15 = s13.concat(s14);
        System.out.println(s15);

        //contains()

        String s16 = "Mac Book Air M1";
        boolean b1 = s16.contains("Boo");
        System.out.println(b1);
        System.out.println(s16.contains("34254"));

        //split()
        String s17 = "My name is Shashank";
        String arr[] = s17.split(" ");
     for(int i=0; i<arr.length; i++){
         System.out.println(arr[i]);
     }
     //trim()
        String s18 = " Shashank ";
     String s19 = s18.trim();
        System.out.println(s19);
        System.out.println(s18.equals(s19));

        //indexOf()
        String s20  = "Malayalam";
        int index = s20.indexOf('a');
        System.out.println(index);
        int index2 = s20.indexOf('Z');
        System.out.println(index2);

        //lastIndexOf()
        int index3 = s20.lastIndexOf('a');
        System.out.println(index3);
        int index4= s20.lastIndexOf('P');
        System.out.println(index4);

        //toCharArray()
        String s21 = "Selenium Automation";
        char arr4[] = s21.toCharArray();
        for (int i=0; i<arr4.length; i++){
            System.out.println(arr4[i]);
        }




    }
}
