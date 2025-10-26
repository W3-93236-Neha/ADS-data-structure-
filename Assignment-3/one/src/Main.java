//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertEnd(10);
        cll.insertEnd(20);
        cll.insertBeginning(5);
        cll.insertEnd(30);

        cll.display();

        cll.delete(20);
        cll.display();
    }
}