import java.util.*;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String args[]) throws Exception{
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Andhra");
        map.put(2,"Odisha");
        map.put(3,"Chennai");
        map.put(4,"Blr");
        map.put(5,"Kerala");
        Set<Map.Entry<Integer,String>> values = map.entrySet();
        for(Map.Entry<Integer,String> e : values){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
