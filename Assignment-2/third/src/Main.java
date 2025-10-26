//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(25);
        list.insertSorted(5);

        System.out.println("Sorted Linked List:");
        list.printList();
    }
}