import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> list;

    public Stack() {
        list = new LinkedList<Integer>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.removeLast();
    }

    public int peek() {
        if(!list.isEmpty()) {
            return list.getFirst();
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
