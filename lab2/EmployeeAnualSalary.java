package lab2;

class User {
    int id;
    String name;

    // Parameterized constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display user details (optional)
    public void displayUserInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Employee extends User {
    double salary; // Monthly salary of the employee

    // Parameterized constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name); // Call the constructor of the User class
        this.salary = salary;
    }

    // Method to calculate the annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to display employee details and annual salary
    public void displayEmployeeInfo() {
        displayUserInfo();
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

public class EmployeeAnualSalary {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "Chetan Verma", 50000.00);

        // Displaying employee details and calculating annual salary
        emp.displayEmployeeInfo();
    }
}


