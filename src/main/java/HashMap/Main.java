package HashMap;

import java.util.HashMap;

public class Main {

    //    Hashmap is a set of keys with value.
    //    Here's an explanation on why and when to use HashSet: '
    //    In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.
    //    The hashcode of an element is a unique identity that helps to identify the element in a hash table.
    //    HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.'


    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 99;

        //how can we store the above values in one easy accessable place - hashmaps

        //<Data type Key, Datatype Value>

        HashMap<String, Integer> happy = new HashMap<String, Integer>();

        //Name.put(Key, value)

        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 99);

        //print out full hashmap
        System.out.println(happy);

        //print key
        System.out.println(happy.get("c"));
    }
}