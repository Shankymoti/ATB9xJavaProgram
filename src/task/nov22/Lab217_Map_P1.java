package task.nov22;

import java.util.HashMap;
import java.util.Map;
import java.util.*; // import all modules
// don't do it, it will slow down the code
public class Lab217_Map_P1 {
    public static void main(String[] args) {
        // a key value pair
        // name : shashank, rollNo : 1, phone :  9709733800
        Map map  =  new HashMap();

      //  Map<String , Object> map1 = new HashMap<>();
        //here data type is fixed
// order is not maintained
        //K
        map.put("name", "shashank");
        map.put("rollNo", 1);
        map.put("phone", 970973333);
        System.out.println(map);

        map.put("name", "kumar");
        System.out.println(map);

    }

}
