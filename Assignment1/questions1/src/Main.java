import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue(4);
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("0. Exit\n1. Push\n2. pop\n3. Peek");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the front number");
                    int num=sc.nextInt();
                    queue.push(num);
                    break;
                case 2:
                    System.out.println("Poped data" + queue.pop());
                    break;
                case 3:
                    System.out.println("Peek data" + queue.peek());
                    break;
            }


        }while(choice!=0);
        sc.close();


    }
}