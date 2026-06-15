import java.util.*;

public class LHM {
    public static void main(String[] args) {

        HashMap<String, Integer> h = new HashMap<>();

        h.put("even", 1);
        h.put("even", 2);
        h.put("even", 3);
        h.put("even", 4);
        h.put("even", 5);

        System.out.println("HashMap : " + h);

        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>(h);

        lh.put("even", 1);
        lh.put("odd", 2);
        lh.put("even", 3);
        lh.put("odd", 4);
        lh.put("even", 5);

        System.out.println("LinkedHashMap : " + lh);
    }
}
