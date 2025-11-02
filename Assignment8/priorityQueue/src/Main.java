//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue(9);
        System.out.println(q.isEmpty());
        System.out.println(q.isEmpty());
        q.push(6);
        q.push(14);
        q.push(3);
        q.push(26);
        q.push(8);
        System.out.println(q.isEmpty());
        System.out.println(q.isEmpty());

        System.out.println("Peeked value:"+ q.peek());
        System.out.println("poped value" +q.pop());
        System.out.println("peeked value:"+ q.peek());

    }
}