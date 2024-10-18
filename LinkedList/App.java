public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.display();

        linkedList.insertEnd(10);
        linkedList.insertEnd(20);
        linkedList.insertEnd(30);

        linkedList.display();

        linkedList.deleteFromFront();
        linkedList.deleteFromFront();

        linkedList.display();
    }
}
