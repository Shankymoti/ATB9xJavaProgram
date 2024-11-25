package task.nov22;

import java.util.HashMap;
import java.util.Map;

public class Lab218_Map_P2 {
    public static void main(String[] args) {
      //  Map<String, Integer> map1 = new HashMap<String, Integer>();
      //  Map<String,Integer> map2 = new HashMap<>();
        Map<String,Integer> map3 = new HashMap();
       // Map map4 =  new HashMap();

        map3.put("id",1);
        map3.put("id",2);
        map3.put("id2",2);
     map3.put("id3",2);
map3.put("id4",4);
map3.put("id5", null);
map3.put("id6", null);
//map3.put(null, null);
        map3.put(null,333);
       // map3.put("id9", );




        System.out.println(map3);

        System.out.println(map3.size());
        System.out.println(map3.isEmpty());
        System.out.println(map3.containsKey("id6"));
        System.out.println(map3.containsValue(null));

        System.out.println(map3.containsValue(2));

        System.out.println(map3.values());
        System.out.println(map3.get("id2"));
        System.out.println(map3.get("id10"));
        System.out.println(map3.keySet());
    }
}
