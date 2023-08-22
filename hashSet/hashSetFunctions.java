package hashSet;

import java.util.HashSet;

public class hashSetFunctions {
    public static void main(String[] args) {
        HashSet <String> h = new HashSet<String>();
        h.add("abc");
        h.add("xyz");
        h.add("abc");
        System.out.println(h);
    }
    
}
