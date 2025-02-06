public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    //Metodo para poder agregar un nodo al final de la lista enlazada
    //Method allow us to add a node to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if(head == null)
            head = newNode;
        else {
            Node<T> current = head;
            while(current.next != null)
                current = current.next;
            current.setNext(newNode);   //Establecemos la siguiente nodo con el valor del nuevo nodo
        }
        System.out.println("Node added to the LinkedList: " + data);
    }

    //Metodo para imprimir los elementos de la lista
    //Method for print the elements of the list
    public void printList(){
        System.out.println("----Printing Linked List-----");
        Node<T> current = head;
        while(current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    //Metodo para remover un nodo de la lista
    //Method for delete a node of the list
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
            }
        }
    }
}
