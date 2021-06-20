package _11_Stack_Queue.baitap;
import java.util.*;

public class DemChuoi {
    public static void main(String[] args) {
            Map<String,Integer>map = new TreeMap<>();
            String string = "h o a n g b a o";
            String chuThuong = string.toLowerCase();
            String[]cat = chuThuong.split("");
            for (String chuoi:cat){
                System.out.print(chuoi + "");
            }
            for(int i = 0; i<cat.length;i++){
                if (cat[i].equals(" ")) {
                    continue;
                }else {
                    if (!map.containsKey(cat[i])) {
                        map.put(cat[i], 1);
                    } else {
                        int count = map.get(cat[i]) + 1;
                        map.put(cat[i],count);
                    }
                }
            }
            System.out.println(map);

    }
}
