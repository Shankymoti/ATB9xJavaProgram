package task.nov20;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("shashank");
        v.add("pramod");
        v.add("amit");
        v.add("sumit");
        v.add("shashank");
        System.out.println(v);
        v.add(1);
        v.add(null);
        v.add(true);
        System.out.println(v);
        v.remove("shashank");
        System.out.println(v);
        System.out.println(v.contains("shashank"));
        System.out.println(v.get(0));
        v.add("shashank");
        System.out.println(v);
        System.out.println(v.indexOf("shashank"));
        System.out.println(v.lastElement());
        System.out.println(v.lastIndexOf("shashank"));
    }
}
