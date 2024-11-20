import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //Tao hashmap de luu danh sach sinh vien
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("Display entry in HashMap");
        System.out.println(hashMap + "\n");
        //Tao treemap trong main de luu key theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //Tao link hashmap trong main luu danh sach sinh vien va hien thi du lieu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println(linkedHashMap.get("A"));
    }
}
