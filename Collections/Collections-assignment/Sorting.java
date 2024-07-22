import java.util.*;


public class Sorting {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        Collections.sort(arr);
        System.out.println(arr); 
        
    }
}
