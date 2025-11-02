import org.w3c.dom.Node;

public class PriorityQueue {
    private final int SIZE;
    private Heap heap;
    public PriorityQueue(int size) {
        this.SIZE = size;
        heap = new Heap(size);

    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public boolean isFull() {
        return heap.isFull();
    }
    public void push(int value) {
        if (heap.isFull()) {
            System.out.println("Queue is full");
        }
        else {
            heap.addHeap(value);
        }
    }
    public int pop() {
        if (heap.isEmpty())
            System.out.println("Queue is empty");
        else
            return heap.deleteHeap();
        return -1;


    }
    public int peek() {
        if (heap.isEmpty())
            System.out.println("Queue is empty");
        else
            return heap.getRoot();
        return -1;
    }
}
