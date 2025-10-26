//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList list = new EmployeeList();
        int choice;

        do {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    list.addEmployee(id, name, salary);
                    break;
                case 2:
                    list.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    list.searchByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    list.deleteById(delId);
                    break;
                case 5:
                    System.out.print("Enter ID to update salary: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    list.updateSalary(updateId, newSalary);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
