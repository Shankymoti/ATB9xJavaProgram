package task.nov19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab199_ArrayList {
    public static void main(String[] args) {
//        Collection list = new ArrayList();//Dynamic dispatch
//        List list1 = new ArrayList();//Dynamic Dispatch
        ArrayList list = new ArrayList();
        list.add("shashank");
        list.add("kuamr");
        list.add("shashank");//Duplicate is allowed
        list.add(1);//Different data type is allowed
        list.add(true);
        list.add(null); // null ia allowed

        System.out.println(list);
    }
}
