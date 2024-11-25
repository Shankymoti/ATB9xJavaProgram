package task.nov21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab213_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set hs = new HashSet();
        // don't allow duplicates
        // not in order

        hs.add("shashank");
        hs.add("shashank");
        hs.add("kuamr");
        hs.add("singh");
        System.out.println(hs.add("singh"));
        hs.add(null);
        System.out.println(hs);

        for (Object h : hs){
            System.out.println(h);
        }

        System.out.println(hs.contains("shashank"));


        Set lhs = new LinkedHashSet();
        //LinkedList mechanism to store element
        // maintain order
        //no duplicates

        lhs.add("shashank");
        lhs.add("kumar");
        lhs.add("shashank");
        lhs.add(null);
        lhs.add(true);
        System.out.println(lhs);

        System.out.println(lhs.contains("shashank"));
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());

        for(Object o1 : lhs){
            System.out.println(o1);
        }


        Set ts = new TreeSet();
        //balck and red tree mechanism is done to store element
        //maintain order
        //no dulicates
        //Natural sorting is done

        ts.add("mango");
        ts.add("mango");
        ts.add("grapes");
        ts.add("orange");
        //ts.add(null); //NullPointerException
     //  ts.add(true); //ClassCastException - class java.lang.String cannot be cast to class java.lang.Boolean
     // ts.add(133); // ClassCastException -class java.lang.String cannot be cast to class java.lang.Integer
        System.out.println(ts);

        for (Object t : ts){
            System.out.println(t);
        }

        Set ts1 = new TreeSet();
        ts1.add(123);
        ts1.add(4);
       // ts1.add("shashank");

        System.out.println(ts1);

    }
}
