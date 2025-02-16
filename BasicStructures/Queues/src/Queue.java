import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<Integer>();
    }

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        if(!list.isEmpty()) {
            int value = list.getFirst();
            list.removeFirst();
            return value;
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public int front() {
        if(!list.isEmpty()) {
            return list.getFirst();
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }
}
