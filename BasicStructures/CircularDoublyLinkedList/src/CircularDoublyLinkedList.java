public class CircularDoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public CircularDoublyLinkedList() {
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            this.head = newNode;
            head.prev = newNode;
            head.next = newNode;
        }
        else{
            Node<T> temp = this.head;
            while(temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
        }
        System.out.println("Node added to the LinkedList: " + data);
    }

    public void printList(){
        System.out.println("----Printing Linked List-----");
        Node<T> current = head;
        if(current == null)
            System.out.println("List is empty");
        else{
            while(current.next != head) {
                System.out.println(current.prev.data + " <- " + current.data + " -> " + current.next.data);
                current = current.next;
            }
            System.out.println(current.prev.data + " <- " + current.data + " -> " + current.next.data);
        }
    }

    public boolean search(T data){
        Node<T> current = head;
        int cont = 0;
        while(current.next != head) {
            if(current.data.equals(data)){
                System.out.println("The node found in the linked list: " + data);
                System.out.println("Position: " + cont);
                return true;
            }
            current = current.next;
            cont++;
        }
        System.out.println("The node was not found in the linked list: ");
        return false;
    }

    public void delete(T data) {
        if(head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if(head.data == data){
            Node<T> temp = this.head;
            while(temp.next != head)
                temp = temp.next;
            tail = temp;
            if(head.data == data){
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            System.out.println("The node was removed from the linked list: " + data);
        }
        else {
            Node<T> current = head;
            while(current.next != head && current.next.data != data)
                current = current.next;
            if(current.next != head) {
                System.out.println("The node was removed from the linked list: " + current.next.data);
                current.next = current.next.next;
                current.next.prev = current;
            }
        }
    }
}
