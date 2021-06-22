package _12_java_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapThucHanh {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "bao");
        map.put(3,"hoang");
        map.put(2,"gia");
        System.out.println(map);

        Map<Integer,String> map2 = new TreeMap<>(map);

        System.out.println(map2);

        Map<Integer,String> map3 = new LinkedHashMap<Integer,String>(16,0.75f,true);
        map.put(41, "bao");
        map.put(31,"hoang");
        map.put(21,"gia");
        System.out.println(map3.get(41));
    }
}
