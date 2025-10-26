class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

