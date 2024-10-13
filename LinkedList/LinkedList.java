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

    public void insertEnd(int value) {
        // 1. make a new node with the desired value.
        Node newNode = new Node(value);

        // 1.1 - if the list is empty we have to set the head to the new node
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        // 2. start at the head and move to the last node.
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // 3. insert the new node after the last node.
        temp.next = newNode;
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
