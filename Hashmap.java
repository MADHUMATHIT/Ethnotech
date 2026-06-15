import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,String>map = new HashMap<>();
        map.put("Tree","neemTree");
        map.put("Bird","parrot");
        map.put("Fruit","mongo");
        map.put("Animal","cat");
        System.out.println(map);
        System.out.println(map.remove("Tree"));
        System.out.println(map);
        System.out.println(map.get("Bird"));
        System.out.println(map.containsKey("Fruit"));
        System.out.println(map.containsValue("mongo"));
    }
    
}
