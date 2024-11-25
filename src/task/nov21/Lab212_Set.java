package task.nov21;

import java.util.*;

public class Lab212_Set {
    public static void main(String[] args) {
        Set s1 =  new HashSet();
        Set ls = new LinkedHashSet();
        Set ts = new TreeSet();

       // Collection c = new HashSet();

       // Object o = new HashSet<>();

        s1.add("shashank");
        s1.add("kumar");
        s1.add("singh");
        //s1.add("shashank");
        s1.add(11);
        System.out.println(s1);
        s1.add(null);
        System.out.println(s1);
        // set does not allow duplicates
        //data is not added in sequence order


    }
}
