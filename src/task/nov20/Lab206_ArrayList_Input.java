package task.nov20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab206_ArrayList_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List names = new ArrayList();
        List ages = new ArrayList();

        String input = "Y"; //continue variable for input loop

        while (input.equalsIgnoreCase("Y")){
            System.out.println("Enter name");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("do you want to enter another record (Y/N)");
            input = sc.nextLine();
        }

        System.out.println(names);
        System.out.println(ages);

        for (Object o : names){
            System.out.println(o);
        }

        for (Object o1: ages){
            System.out.println(o1);
        }

        sc.close();
    }
}
