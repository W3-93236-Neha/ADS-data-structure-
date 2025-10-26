class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class Deque {
    Node front, rear;

    // Insert at front
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Insert at rear
    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    // Delete from front
    public void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty.");
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
    }

    // Delete from rear
    public void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty.");
            return;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
    }

    // Display deque from front to rear
    public void display() {
        if (front == null) {
            System.out.println("Deque is empty.");
            return;
        }
        Node current = front;
        System.out.print("Deque: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
