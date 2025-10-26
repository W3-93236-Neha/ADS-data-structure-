public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;

        System.out.println("Original list:");
        list.printList();

        list.insertAfter(list.head, 15); // Insert 15 after 10
        list.insertBefore(third, 25);    // Insert 25 before 30

        System.out.println("Updated list:");
        list.printList();
    }
}
