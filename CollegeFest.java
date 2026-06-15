import java.util.LinkedList;
import java.util.Queue;

class CollegeFest {

    static void addStudent(Queue<String> students, String name) {
        if (!students.contains(name)) {
            students.add(name);
            System.out.println(name + " Registered");
        } else {
            System.out.println(name + " Already Registered");
        }
    }

    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();

        addStudent(students, "Madhu");
        addStudent(students, "Ravi");
        addStudent(students, "Madhu"); 
        addStudent(students, "Sita");
        addStudent(students, "Kiran");

        System.out.println("Registered Students:");
        System.out.println(students);

        System.out.println("Total Students: " + students.size());

        String firstRemoved = students.remove();
        System.out.println("First Removed Student: " + firstRemoved);

        String secondRemoved = students.remove();
        System.out.println("Second Removed Student: " + secondRemoved);

        System.out.println("Students After Removal:");
        System.out.println(students);

        System.out.println("Remaining Students: " + students.size());
    }
}