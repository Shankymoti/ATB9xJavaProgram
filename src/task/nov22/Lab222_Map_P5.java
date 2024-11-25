package task.nov22;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab222_Map_P5 {
    public static void main(String[] args) {
        //HashTable - >  Syncronised , it is a legacy class
        // Thread1 and Thread2 - they will use one by one

        Hashtable<Integer, String>  ht = new Hashtable();
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        ht.put(3,"3");
        System.out.println(ht);
     //  ht.put(null,"Null"); NullPointerException
       // ht.put(5,null); NullPointerException

        HashMap<Integer, String > hm = new HashMap();

        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"3");
        hm.put(3,"Three");

        hm.put(null, null);
        hm.put(5,null);
        System.out.println(hm);


        Enumeration en = ht.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
