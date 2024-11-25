package task.nov21;

import java.util.Enumeration;
import java.util.Vector;

public class Lab215_Vector {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Orange");
        v.add("Grapes");
        v.add("Apple");

        for (String s :  v){
            System.out.println(s);
        }

        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }}
