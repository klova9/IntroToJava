package JavaPractice.WarmUp.Mapping;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    /*
     * Modify and return the given map as follows: if the key "a" has a value, set
     * the key "b" to have that value, and set the key "a" to have the value "".
     * Basically "b" is a bully, taking the value and replacing it with the empty
     * string.
     */
    static Map<String, String> mapbully () {
        Map<String, String> map = new HashMap<>();
        if (map.containsKey("a")) {
            map.put("a", map.get("b"));
            map.put("a", "");
        }
        return map;
    }
    public static void main(String[] args) {
        
    }
}
