//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertFront(1);

        deque.display();

        deque.deleteFront();
        deque.deleteRear();

        deque.display();
    }
}