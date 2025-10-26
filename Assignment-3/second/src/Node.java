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

    // Add node at specific position (0-based index)
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Case 1: Empty list
        if (tail == null) {
            if (position != 0) {
                System.out.println("Invalid position for empty list.");
                return;
            }
            tail = newNode;
            tail.next = tail;
            return;
        }

        // Case 2: Insert at beginning
        if (position == 0) {
            newNode.next = tail.next;
            tail.next = newNode;
            return;
        }

        // Traverse to position
        Node current = tail.next;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == tail.next) {
                System.out.println("Position out of bounds.");
                return;
            }
        }

        newNode.next = current.next;
        current.next = newNode;

        // Update tail if inserted at end
        if (current == tail) {
            tail = newNode;
        }
    }

    // Delete node at specific position (0-based index)
    public void deleteAtPosition(int position) {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;

        // Case 1: Delete first node
        if (position == 0) {
            if (tail == tail.next) {
                tail = null;
            } else {
                tail.next = current.next;
            }
            return;
        }

        // Traverse to node before target
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == tail) {
                System.out.println("Position out of bounds.");
                return;
            }
        }

        Node target = current.next;
        current.next = target.next;

        // Update tail if deleting last node
        if (target == tail) {
            tail = current;
        }
    }

    // Display list
    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println(" ");
    }
}

