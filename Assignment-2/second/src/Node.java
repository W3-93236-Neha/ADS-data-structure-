public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class SinglyLinkedList{
    Node head;
     // Add node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printReverse(Node node){
        if (node == null) return;
        printReverse(node.next);
        System.out.println(node.data);
    }
    public void displayReverse(){
        System.out.println("list in reverse order");
        printReverse(head);
        System.out.println();

    }
}

