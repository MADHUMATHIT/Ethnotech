import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

        Set<Integer> Rollno = new HashSet<>();
        Rollno.add(1);
        Rollno.add(2);
        Rollno.add(1); 

        System.out.println("HashSet Roll Numbers: " + Rollno);
 
        HashSet<String> names = new HashSet<>();
        names.add("A");
        names.add("B");
        names.add("A"); 

        System.out.println("HashSet Names: " + names);
        System.out.println("Size: " + names.size());
        System.out.println("Contains A: " + names.contains("A"));

        names.remove("A");

        LinkedList<Integer> list = new LinkedList<>();
        for (Integer i : Rollno) {
            list.add(i);
        }

        System.out.println("Is List Empty? " + list.isEmpty());
        System.out.println("Removed First Element: " + list.removeFirst());
        System.out.println("List After Removal: " + list);

        
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(10); 

        System.out.println("TreeSet: " + tree);
        System.out.println("First Element: " + tree.first());
        System.out.println("Last Element: " + tree.last());
    }
}