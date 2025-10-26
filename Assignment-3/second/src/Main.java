//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addAtPosition(10, 0); //add first
        cll.addAtPosition(20, 1); //add last
        cll.addAtPosition(15, 1); //add mid
        cll.display();

        cll.deleteAtPosition(1);
        cll.display();

        cll.deleteAtPosition(0);  // Delete first
        cll.display();
    }
}