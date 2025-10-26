public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Initialize employee array
        employees[0] = new Employee(101, "Alice", 50000);
        employees[1] = new Employee(102, "Bob", 55000);
        employees[2] = new Employee(103, "Charlie", 60000);
        employees[3] = new Employee(104, "David", 52000);
        employees[4] = new Employee(105, "Eve", 58000);

        // Search by empId
        int searchId = 103;
        System.out.println("Searching for empId: " + searchId);
        boolean foundId = false;
        for (Employee emp : employees) {
            if (emp.empId == searchId) {
                emp.display();
                foundId = true;
                break;
            }
        }
        if (!foundId) System.out.println("Employee with ID " + searchId + " not found.");

        // Search by name
        String searchName = "David";
        System.out.println("\nSearching for name: " + searchName);
        boolean foundName = false;
        for (Employee emp : employees) {
            if (emp.name.equalsIgnoreCase(searchName)) {
                emp.display();
                foundName = true;
                break;
            }
        }
        if (!foundName) System.out.println("Employee with name " + searchName + " not found.");
    }
}
