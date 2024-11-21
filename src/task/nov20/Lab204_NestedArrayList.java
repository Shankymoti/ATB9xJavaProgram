package task.nov20;

import java.util.ArrayList;
import java.util.List;

public class Lab204_NestedArrayList {
    public static void main(String[] args) {
        List fruits1 = new ArrayList();
        fruits1.add("mango");
        fruits1.add("banana");
        fruits1.add("ornage");

        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("grapes");
        fruits2.add("papaya");
        fruits2.add("gauva");

        System.out.println(fruits2);

        List vegitable = new ArrayList<>();
        vegitable.add("tomato");
        vegitable.add("potato");
        vegitable.add("brinjal");

        System.out.println(vegitable);

        List all = new ArrayList();

        all.add(fruits1);
        all.add(vegitable);
        all.add(fruits2);
        all.add("milk");
        all.add("butter milk");

        System.out.println(all);
    }
}
