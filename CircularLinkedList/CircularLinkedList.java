public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        tail.next = head;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            if (temp == tail)
                break;
            temp = temp.next;
        }
        System.out.println();
    }
}
