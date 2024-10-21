public class App {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();

        myList.insertEnd(10);
        myList.insertEnd(20);
        myList.insertEnd(30);

        myList.display();
    }
}