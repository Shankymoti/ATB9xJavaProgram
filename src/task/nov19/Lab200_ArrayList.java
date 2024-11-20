package task.nov19;

import java.util.ArrayList;
import java.util.List;

public class Lab200_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("3"));
        System.out.println(list.indexOf("4"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list.lastIndexOf("4"));
        System.out.println(list.get(4));
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
    }
}
