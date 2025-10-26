class Employee {
    int empId;
    String name;
    double salary;
    Employee prev, next;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.prev = null;
        this.next = null;
    }
}

class EmployeeList {
    Employee head = null, tail = null;

    // Add employee at end
    public void addEmployee(int empId, String name, double salary) {
        Employee newEmp = new Employee(empId, name, salary);
        if (head == null) {
            head = tail = newEmp;
        } else {
            tail.next = newEmp;
            newEmp.prev = tail;
            tail = newEmp;
        }
        System.out.println("Employee added successfully.");
    }

    // Display all employees
    public void displayEmployees() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }
        Employee current = head;
        System.out.println("Employee List:");
        while (current != null) {
            System.out.println("ID: " + current.empId + ", Name: " + current.name + ", Salary: " + current.salary);
            current = current.next;
        }
    }

    // Search employee by name
    public void searchByName(String name) {
        Employee current = head;
        boolean found = false;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Found: ID: " + current.empId + ", Name: " + current.name + ", Salary: " + current.salary);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("Employee not found.");
    }

    // Delete employee by empId
    public void deleteById(int empId) {
        Employee current = head;
        while (current != null) {
            if (current.empId == empId) {
                if (current == head) head = current.next;
                if (current == tail) tail = current.prev;
                if (current.prev != null) current.prev.next = current.next;
                if (current.next != null) current.next.prev = current.prev;
                System.out.println("Employee deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Employee ID not found.");
    }

    // Update salary by empId
    public void updateSalary(int empId, double newSalary) {
        Employee current = head;
        while (current != null) {
            if (current.empId == empId) {
                current.salary = newSalary;
                System.out.println("Salary updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Employee ID not found.");
    }
}

