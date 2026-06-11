class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
    }
}

class Bus {
    public static void main(String args[]) {

        Node p1 = new Node("Ravi");
        Node p2 = new Node("Madhu");
        Node p3 = new Node("Kiran");

        p1.next = p2;
        p2.next = p3;

        Node temp = p1;

        System.out.println("Passengers in Bus:");

        while(temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}