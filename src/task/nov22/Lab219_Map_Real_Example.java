package task.nov22;

import java.util.*;

public class Lab219_Map_Real_Example {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap();
        student.put("name", "shashank");
        student.put("rollNo",1);
        student.put("phone", 897969787);
        student.put("address", "Bihar");
        System.out.println(student);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);




    }
}
