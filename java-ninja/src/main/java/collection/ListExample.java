package collection;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class ListExample {
    public static void main(String[] args) {
        callListExample();
        callMapExample();
    }

    private static void callMapExample() {
        Map hashmap = new HashMap<String, String>();
        hashmap.put("zuhi", "Sweet,caring and innocent");
        hashmap.put("mj", "smart,very rare though");
        hashmap.put("mj1", "owl");

        System.out.println();
        System.out.println("This is hash map example code");
        String[] keys = {"zuhi", "mj", "mj1"};
        for (String key : keys) {
            System.out.println(key + " is " + hashmap.get(key));
        }
    }

    private static void callListExample() {
        System.out.println("This is array list example code");
        ArrayList<Integer> Val = new ArrayList<Integer>();
        
        Val.add(1);
        Val.add(5);
        Val.add(9);
        for(int i:Val) {
        	System.out.println(i);
        	System.out.print(i);
        }
        
    }
}
