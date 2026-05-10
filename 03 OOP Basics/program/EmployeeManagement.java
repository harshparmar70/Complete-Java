
import java.util.Scanner;

class Employee {

    // Encapsulated variables
    private int 
    ;
    private String name;
    private double salary;
    private String department;

    // Constructor
    Employee(int empId, String name, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter Methods
    int getEmpId() {
        return empId;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    String getDepartment() {
        return department;
    }

    // Setter Methods
    void setName(String name) {
        this.name = name;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    // Display Method
    void display() {
        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Department  : " + department);
    }

    // Bonus Method
    void calculateBonus() {
        double bonus = salary * 0.10;

        System.out.println("Bonus Amount : " + bonus);
    }
}

class EmployeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Employee Object
        Employee e1 = new Employee(101, "Harsh", 50000, "IT");

        int choice;
        double newSalary;
        String newName;
        String newDepartment;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Display Employee Details");
            System.out.println("2. Update Name");
            System.out.println("3. Update Department");
            System.out.println("4. Update Salary");
            System.out.println("5. Calculate Bonus");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:

                    e1.display();
                    break;

                case 2:

                    System.out.print("Enter New Name: ");
                    newName = sc.nextLine();

                    e1.setName(newName);

                    System.out.println("Name Updated Successfully");
                    break;

                case 3:

                    System.out.print("Enter New Department: ");
                    newDepartment = sc.nextLine();

                    e1.setDepartment(newDepartment);

                    System.out.println("Department Updated Successfully");
                    break;

                case 4:

                    System.out.print("Enter New Salary: ");
                    newSalary = sc.nextDouble();

                    e1.setSalary(newSalary);

                    System.out.println("Salary Updated Successfully");
                    break;

                case 5:

                    e1.calculateBonus();
                    break;

                case 6:

                    System.out.println("Program Ended");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
