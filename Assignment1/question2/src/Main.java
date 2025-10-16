import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack =new Stack(2);
        int choice;

        do{
            System.out.println("0. Exit 1. push\n 2. pop\n  3.peek\n  4.display");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the number to push: ");
                    stack.push(input.nextInt());
                    break;

                    case 2:
                        System.out.println("stack popped" +stack.pop());
                case 3:
                    System.out.println("stack peeked" +stack.peek());
                    case 4:
                        System.out.println("stack display");
            }


        }while (choice!=0);
        input.close();



    }
}