public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertFront(int value) {
        // 1. create a new node
        Node newNode = new Node(value);

        // 2. set next of the new node to the current head
        newNode.next = head;

        // 3. set newNode as the head.
        head = newNode;
    }

    public void display() {
        // 1. Create a temporal node pointing to the current head.
        Node temp = head;

        // 2. We have to use the temporal node to acces to every node of the list.
        while (temp != null) {
            // 3. We have to use the temporal node to get and print the value of the current
            // node.
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
