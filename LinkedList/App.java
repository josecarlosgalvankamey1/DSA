public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertFront(1);
        linkedList.insertFront(2);
        linkedList.insertFront(3);

        linkedList.display();

        linkedList.insertEnd(10);
        linkedList.insertEnd(20);
        linkedList.insertEnd(30);

        linkedList.display();
    }
}
