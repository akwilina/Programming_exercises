package codingbat.java.maps;

import java.util.Map;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {

        if(!map.isEmpty()) {
            if(map.containsKey("a") && map.containsKey("b")) {
                if (map.get("a").length() != map.get("b").length()) {
                    if (map.get("a").length() > map.get("b").length()) {
                        map.put("c", map.get("a"));
                    } else if (map.get("a").length() < map.get("b").length()) {
                        map.put("c", map.get("b"));
                    }
                }

                if (map.get("a").length() == map.get("b").length()) {
                    map.put("a", "");
                    map.put("b", "");
                }
            }
        }
        return map;
    }

    public Map<String, String> mapAB41(Map<String, String> map) {

        if(map.get("a") != null && map.get("b") != null){
            if(map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else if (map.get("a").length() < map.get("b").length()){
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}