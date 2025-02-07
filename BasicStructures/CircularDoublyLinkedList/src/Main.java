public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList<Integer> list = new CircularDoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();
        list.search(4);
        list.delete(6);
        list.printList();
    }
}