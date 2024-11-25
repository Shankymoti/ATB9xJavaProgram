package task.nov21;

import java.util.ArrayList;
import java.util.List;

public class Lab211_Array_List_Class {
    public static void main(String[] args) {
     Student s1 = new Student("shashank",1);
     Student s2 = new Student("amit", 2);
     Student s3 = new Student("sumit", 3);
    s1.printDetails();
        List<Student> list =  new ArrayList<>();
        list.add(s1);
        System.out.println(list);
        s1.printDetails();

        list.add(s2);
        list.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(list);
    }
}
