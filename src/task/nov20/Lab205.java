package task.nov20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab205 {
    public static void main(String[] args) {
        List marks = new ArrayList();

        marks.add(98);
        marks.add(99);
        marks.add(97);
        marks.add(95);
        marks.add(90);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

//        Collections.reverse(marks);
//        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
