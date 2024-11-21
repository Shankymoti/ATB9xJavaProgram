package task.nov20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("milk");
        list.add("butter");
        list.add("cheese");
        list.add("bread");
        list.add("jam");
        list.add(123);
        list.add(true);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("jam"));
        System.out.println(list.size());

        System.out.println("------------default for loop");
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("----------for each loop");
        for (Object o :list){
            System.out.println(o);
        }

        System.out.println("------ to Print Array List Iterator");
        // Iterator ->> go one by one forward and get access them
        //hasNext() -> if we have next element -> true
        //next() -> access the element

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
