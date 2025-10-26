class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node tail = null;

    // Insert at end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    // Delete a node by value
    public void delete(int key) {
        if (tail == null) return;

        Node current = tail.next;
        Node prev = tail;

        do {
            if (current.data == key) {
                if (current == tail && current == tail.next) {
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    // Display the list
    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + "  ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("");
    }
}
