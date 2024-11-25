package task.nov22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap();
        student1.put("name","promod");
        student1.put("phone","8789798");
        student1.put("address","Delhi");
        System.out.println(student1);

        HashMap<String, String> student2 =  new HashMap<>();
       student2.put("name", "shashank");
       student2.put("phone", "9789634893");
       student2.put("address","Bihar");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
