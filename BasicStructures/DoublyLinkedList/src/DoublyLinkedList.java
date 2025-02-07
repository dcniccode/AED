public class DoublyLinkedList<T> {
    private Node<T> head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null)
            head = newNode;
        else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Node added to the LinkedList: " + data);
    }

    public void printList(){
        System.out.println("----Printing Linked List-----");
        Node<T> current = head;
        if(current == null)
            System.out.println("List is empty");
        else if(current.next == null){
            System.out.println("NULL <- " + current.data + "  -> NULL");
        }
        else{
            System.out.println("NULL <- " + current.data + " -> " + current.next.data);
            current = current.next;
            while(current.next != null) {
                System.out.println(current.prev.data + " <- " + current.data + " -> " + current.next.data);
                current = current.next;
            }
            System.out.println(current.prev.data + " <- " + current.data + " -> NULL");
        }
    }

    public boolean search(T data) {
        Node<T> current = head;
        int cont = 0;
        while(current != null) {
            if(current.data.equals(data)){
                System.out.println("The node found in the linked list: " + data);
                System.out.println("Position: " + cont);
                return true;
            }
            current = current.next;
            cont++;
        }
        System.out.printf("The node was not found in the linked list: " + data);
        return false;
    }

    public void delete(T data) {
        if(head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if(head.data == data){
            head = head.next;
            System.out.println("The node was removed from the linked list: " + data);
        }
        else {
            Node<T> current = head;
            while(current.next != null && current.next.data != data)
                current = current.next;
            if(current.next != null) {
                System.out.println("The node was removed from the linked list: " + current.next.data);
                current.next = current.next.next;
                current.next.prev = current;
            }
        }
    }
}
