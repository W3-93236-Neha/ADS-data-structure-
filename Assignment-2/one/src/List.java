class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head;

    // Insert a new node after a given node
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Insert a new node before a given node
    public void insertBefore(Node targetNode, int newData) {
        if (head == null || targetNode == null) {
            System.out.println("Invalid input.");
            return;
        }

        Node newNode = new Node(newData);

        // If inserting before the head
        if (head == targetNode) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.next != targetNode) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Target node not found.");
            return;
        }

        newNode.next = targetNode;
        current.next = newNode;
    }

    // Utility method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
