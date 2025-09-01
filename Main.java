import java.util.LinkedList;

// Stack implementation using LinkedList
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push an item onto the stack
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Peek at the top item of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }
}

// Queue implementation using LinkedList
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Enqueue an item into the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Dequeue an item from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Peek at the front item of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return list.size();
    }
}

public class Main {
    public static void main(String[] args) {
        // Stack example
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Queue example
        Queue<String> queue = new Queue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        System.out.println("\nQueue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
