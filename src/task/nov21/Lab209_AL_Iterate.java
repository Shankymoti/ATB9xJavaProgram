package task.nov21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Lab209_AL_Iterate {
    public static void main(String[] args) {
        List<String> al =  new ArrayList();
        al.add("shashank");
        al.add("kumar");
        al.add("promod");

        System.out.println(" to print array list via for Each ");

//        for(Object str : al){
        for(String str : al){
            System.out.println(str);
        }

        System.out.println(" To print array list via for loop");
        for (int i =0; i<al.size(); i++){
            System.out.println(al.get(i));
        }


        System.out.println("to print array list via iterator");
        //Iterator<String> iterator = al.iterator();

        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
