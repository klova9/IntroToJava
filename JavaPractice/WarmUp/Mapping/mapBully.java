package JavaPractice.WarmUp.Mapping;

import java.util.HashMap;
import java.util.Map;

public class mapBully {    
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
