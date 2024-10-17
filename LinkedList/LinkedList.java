public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
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
            this.tail = newNode;
            return;
        }

        // Set next of tail to the new node
        tail.next = newNode;

        // Set new node as the new tail
        tail = newNode;
    }

    public void insertAfterK(int value, int k) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node current = head;

        // 1. iterate to the kth node
        for (int i = 1; i < k; ++i) {
            current = current.next;
        }

        // 2. Set the next of the newNode to the next of the current node
        newNode.next = current.next;

        // 3. Set the next of the current node to the new node.
        current.next = newNode;

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
