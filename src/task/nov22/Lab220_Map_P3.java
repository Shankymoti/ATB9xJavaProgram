package task.nov22;

import java.util.HashMap;
import java.util.Map;

public class Lab220_Map_P3 {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap();
        map.put("id", 1 );
        map.put("id2", 5);
        map.put("id",4);
        map.put(null,990);
        map.put("id7",null);
        map.put("id5",1);

        //iterate
        for (Map.Entry<String,Integer> item : map.entrySet()){
            System.out.println(item.getKey()+" is key "+ item.getValue()+" is value");
        }

    }
}
