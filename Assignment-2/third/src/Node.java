class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SortedLinkedList {
    Node head;

    // Insert value in sorted order
    public void insertSorted(int value) {
        Node newNode = new Node(value);

        // Case 1: Empty list or insert before head
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Traverse to find correct position
        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        // Insert after current
        newNode.next = current.next;
        current.next = newNode;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
